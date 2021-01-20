package com.frankieci.concurrency.cache;

import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.map.LRUMap;

import javax.annotation.concurrent.ThreadSafe;
import java.util.ArrayList;

/**
 * Created by frankieci on 2020/5/11 1:48 pm
 */
@ThreadSafe
public class LightWeightCacheInMemory<K, T> {

    private long timeToLive;
    private final LRUMap cacheMap;

    private class CacheObject {
        private long lastAccessed = System.currentTimeMillis();
        private T value;

        private CacheObject(T value) {
            this.value = value;
        }
    }

    public LightWeightCacheInMemory(long timeToLive, final long timerInterval, int maxItems) {
        this.timeToLive = timeToLive * 1000;
        cacheMap = new LRUMap(maxItems);

        if (this.timeToLive > 0 && timerInterval > 0) {
            Thread t = new Thread(new Runnable() {
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(timerInterval * 1000);
                        } catch (InterruptedException ex) {
                            //no-up
                        }

                        cleanup();
                    }
                }
            });

            t.setDaemon(true);
            t.start();
        }
    }

    public void put(K key, T value) {
        synchronized (cacheMap) {
            cacheMap.put(key, new CacheObject(value));
        }
    }

    @SuppressWarnings("unchecked")
    public T get(K key) {
        synchronized (cacheMap) {
            CacheObject c = (CacheObject) cacheMap.get(key);

            if (c == null)
                return null;
            else {
                c.lastAccessed = System.currentTimeMillis();
                return c.value;
            }
        }
    }

    public void remove(K key) {
        synchronized (cacheMap) {
            cacheMap.remove(key);
        }
    }

    public int size() {
        synchronized (cacheMap) {
            return cacheMap.size();
        }
    }

    @SuppressWarnings("unchecked")
    public void cleanup() {
        long now = System.currentTimeMillis();
        ArrayList<K> deleteKey;

        synchronized (cacheMap) {
            MapIterator itr = cacheMap.mapIterator();
            deleteKey = new ArrayList<K>((cacheMap.size() / 2) + 1);
            K key;
            CacheObject c;
            while (itr.hasNext()) {
                key = (K) itr.next();
                c = (CacheObject) itr.getValue();

                if (c != null && (now > (timeToLive + c.lastAccessed))) {
                    deleteKey.add(key);
                }
            }
        }

        for (K key : deleteKey) {
            synchronized (cacheMap) {
                cacheMap.remove(key);
            }

            Thread.yield();
        }
    }
}
