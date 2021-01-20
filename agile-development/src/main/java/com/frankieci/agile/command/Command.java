package com.frankieci.agile.command;

public interface Command {
    /**
     * <p>
     * use send a new command for en engine, or invoking {@see run()}, it only traversing list, execute and remove
     * each command.
     * </p>
     *
     * @throws Exception
     */
    void execute() throws Exception;
}
