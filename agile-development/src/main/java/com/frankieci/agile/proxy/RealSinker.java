package com.frankieci.agile.proxy;

public class RealSinker implements Sinker {

    @Override
    public void sink() {
        System.out.println("Real Sink data.");
    }
}
