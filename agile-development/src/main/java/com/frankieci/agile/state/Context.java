package com.frankieci.agile.state;

/**
 * 环境类维护一个State对象
 */
public class Context {

    private State state;

    public void request(State state) {
        this.state = state;
        state.handle();
    }
}
