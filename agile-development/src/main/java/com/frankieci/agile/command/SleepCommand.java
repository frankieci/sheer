package com.frankieci.agile.command;

public class SleepCommand implements Command {

    private Command wakeupCommand;
    private ActiveObjectEngine engine;
    private long sleepTime = 0;
    private long startTime = 0;
    private boolean started = false;

    public SleepCommand(long milliseconds, ActiveObjectEngine engine, Command wakeupCommand) {
        this.wakeupCommand = wakeupCommand;
        this.engine = engine;
        this.sleepTime = milliseconds;
    }

    @Override
    public void execute() throws Exception {
        long currentTime = System.currentTimeMillis();
        if (!started) {
            started = true;
            startTime = currentTime;
            engine.addCommand(this);
        } else if ((currentTime - startTime) < sleepTime) {
            engine.addCommand(this);
        } else {
            engine.addCommand(wakeupCommand);
        }
    }
}
