package com.frankieci.agile.template;

public class ProcessorClient {
    public static void main(String[] args) {
        Processor processor = () -> System.out.println("transact");
        processor.process();
    }
}
