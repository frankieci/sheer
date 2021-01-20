package com.frankieci.agile.builder;

public class ChinaAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public ChinaAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = builder.buildEngine();
        EscapeTower escapeTower = builder.buildEscapeTower();
        OrbitalModule orbitalModule = builder.buildOrbitalModule();
        return new AirShip(engine, escapeTower, orbitalModule);
    }
}
