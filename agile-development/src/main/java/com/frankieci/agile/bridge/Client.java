package com.frankieci.agile.bridge;

public class Client {

    public static void main(String[] args) {
        MessageType message = new CommonMessageType();
        MessageOperator operator = new SystemMessageOperator(message);
        operator.operate();
        MessageType message1 = new UrgentMessageType();
        MessageOperator operator1 = new BusinessMessageOperator(message1);
        operator1.operate();

        MessageOperator operator2 = new BusinessMessageOperator(() -> System.out.println("特急处理"));
        operator2.operate();
    }
}
