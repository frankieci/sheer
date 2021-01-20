package com.frankieci.agile.adapter;

public class Adapter implements Target {

    private Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void request() {
        source.SpecificRequest();
    }
}
