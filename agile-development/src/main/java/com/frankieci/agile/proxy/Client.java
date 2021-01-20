package com.frankieci.agile.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    // dynamic proxy
    public static void main(String[] args) {
        Sinker realSinker = new RealSinker();
        InvocationHandler handler = new SinkHandler(realSinker);
        Sinker proxy = (Sinker) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Sinker.class}, handler);
        proxy.sink();
    }
}
