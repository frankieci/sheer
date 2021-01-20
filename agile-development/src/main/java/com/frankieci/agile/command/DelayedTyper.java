package com.frankieci.agile.command;

public class DelayedTyper implements Command {

    private long delay;
    private char itsChar;

    private static boolean stop = false;
    private static ActiveObjectEngine engine = new ActiveObjectEngine();

    public DelayedTyper(long delay, char c) {
        this.delay = delay;
        this.itsChar = c;
    }

    @Override
    public void execute() throws Exception {
        System.out.println(itsChar);
        if (!stop) {
            delayAndRepeat();
        }
    }

    private void delayAndRepeat() throws CloneNotSupportedException {
        engine.addCommand(new SleepCommand(delay, engine, this));
    }
}
