package com.frankieci.agile.composite;

public class Plugin implements Leaf {

    private String name;

    public Plugin(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println("单插件--->" + name);
    }
}
