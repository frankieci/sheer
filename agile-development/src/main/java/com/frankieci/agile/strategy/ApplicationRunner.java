package com.frankieci.agile.strategy;

public class ApplicationRunner {

    private Application application;

    public ApplicationRunner(Application application) {
        this.application = application;
    }

    public void run() {
        application.init();
        while (!application.done()) {
            application.idle();
        }
        application.cleanup();
    }
}
