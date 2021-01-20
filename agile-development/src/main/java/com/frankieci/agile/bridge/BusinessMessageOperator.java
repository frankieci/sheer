package com.frankieci.agile.bridge;

public class BusinessMessageOperator extends MessageOperator {

    public BusinessMessageOperator(MessageType messageType) {
        this.messageType = messageType;
    }

    @Override
    public void operate() {
        System.out.print("业务消息--");
        this.messageType.process();
    }
}
