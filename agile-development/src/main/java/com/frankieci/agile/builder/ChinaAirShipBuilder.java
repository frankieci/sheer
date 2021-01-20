package com.frankieci.agile.builder;

public class ChinaAirShipBuilder implements AirShipBuilder {

    @Override
    public Engine buildEngine() {
        return new Engine("China engine");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        return new OrbitalModule("China  orbital");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        return new EscapeTower("China escapeTower");
    }
}
