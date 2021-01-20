package com.frankieci.agile.builder;

public class AirShip {
    private Engine engine;
    private EscapeTower escapeTower;
    private OrbitalModule orbitalModule;

    public AirShip(Engine engine, EscapeTower escapeTower, OrbitalModule orbitalModule) {
        this.engine = engine;
        this.escapeTower = escapeTower;
        this.orbitalModule = orbitalModule;
    }

    public void launch() {
        System.out.println("发射！");
    }
}

class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EscapeTower {
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}