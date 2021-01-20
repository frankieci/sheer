package com.frankieci.agile.bridge;

public class UrgentMessageType implements MessageType {

    @Override
    public void process() {
        System.out.println("加急处理");
    }
}
