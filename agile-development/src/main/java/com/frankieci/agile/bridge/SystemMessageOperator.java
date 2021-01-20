package com.frankieci.agile.bridge;

public class SystemMessageOperator extends MessageOperator {

    public SystemMessageOperator(MessageType messageType) {
        this.messageType = messageType;
    }

    @Override
    public void operate() {
        System.out.print("系统消息--");
        this.messageType.process();
    }
}
