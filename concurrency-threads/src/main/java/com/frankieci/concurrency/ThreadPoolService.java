package com.frankieci.concurrency;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by frankieci on 2020/5/30 11:02 pm
 */
public class ThreadPoolService {

    private ScheduledExecutorService service;
    private ExecutorService threadPoll;

    public ThreadPoolService(int poolSize) {
        this.service = new ScheduledThreadPoolExecutor(1,
                new BasicThreadFactory.Builder().namingPattern("thread-poll-service").daemon(true).build());

        this.threadPoll = new ThreadPoolExecutor(poolSize, poolSize, 0L,
                TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(1000),
                new ThreadFactoryBuilder().setNameFormat("service-%d").build());
    }

    public void execute() {
        this.service.schedule(() -> System.out.println("executing......"), 1000, TimeUnit.SECONDS);
    }

    public void submit() {
        this.threadPoll.submit(() -> System.out.println("submitting......"));
    }
}
