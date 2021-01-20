package com.frankieci.agile.composite;

public class Client {

    public static void main(String[] args) {
        Component plugin = new Plugin("叶子插件");
        plugin.operate();

        Composite pluginPackage = new PluginPackage("主插件包");
        pluginPackage.add(plugin);
        pluginPackage.operate();
    }
}
