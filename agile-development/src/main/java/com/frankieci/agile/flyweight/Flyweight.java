package com.frankieci.agile.flyweight;

public interface Flyweight {
    void display(UnSharedConcreteFlyweight uscf);
}

/**
 * 内部状态，可共享
 */
class ConcreteFlyweight implements Flyweight {

    private String displayName;

    public ConcreteFlyweight(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void display(UnSharedConcreteFlyweight uscf) {
        System.out.println("displayName: " + displayName);
        System.out.println("display: {high: " + uscf.getHigh() + "   weight: " + uscf.getWeight() + "}");
    }
}
