package com.frankieci.agile.bridge;

public class CommonMessageType implements MessageType {

    @Override
    public void process() {
        System.out.println("普通处理");
    }
}
