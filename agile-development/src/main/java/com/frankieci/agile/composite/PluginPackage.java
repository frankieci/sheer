package com.frankieci.agile.composite;

import java.util.ArrayList;
import java.util.List;

public class PluginPackage implements Composite {

    private String name;
    private List<Component> componentList = new ArrayList<>();

    public PluginPackage(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return componentList.get(index);
    }

    @Override
    public void operate() {
        System.out.println("插件包--->" + name);
        componentList.forEach(Component::operate);
    }
}
