package com.frankieci.agile.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> flyweightMap = new ConcurrentHashMap<>();

    public static Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweightMap.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key, flyweight);
        }
        return flyweight;
    }
}
