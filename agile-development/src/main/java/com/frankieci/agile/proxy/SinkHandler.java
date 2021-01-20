package com.frankieci.agile.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SinkHandler implements InvocationHandler {

    private Sinker sinker;

    public SinkHandler(Sinker sinker) {
        this.sinker = sinker;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = null;
        if ("sink".equals(method.getName())) {
            invoke = method.invoke(sinker, args);
        }
        return invoke;
    }
}
