package com.frankieci.concurrency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadService {

    private static final Logger logger = LoggerFactory.getLogger(ThreadService.class);
    private Thread executeThread;
    private boolean finished = false;

    public void execute(Runnable r, String threadName) {
        executeThread = new Thread() {
            @Override
            public void run() {
                Thread runner = new Thread(r, threadName);
                runner.setDaemon(true);
                runner.start();
                try {
                    runner.join();
                    finished = true;
                } catch (InterruptedException e) {
                    logger.warn("线程[{}]被中断", threadName);
                }
            }
        };
        executeThread.start();
    }

    public void shutdown(long mills) {
        long currentTime = System.currentTimeMillis();
        while (!finished) {
            long nowTime = System.currentTimeMillis();
            if (nowTime - currentTime >= mills) {
                logger.warn("任务超时：{}", nowTime - currentTime);
                executeThread.interrupt();
                break;
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                logger.warn("执行线程被打断！");
                break;
            }
        }
        finished = false;
    }
}
