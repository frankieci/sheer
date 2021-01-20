package com.frankieci.agile.flyweight;

/**
 * 外部状态
 */
public class UnSharedConcreteFlyweight {

    private int high;
    private int weight;

    public UnSharedConcreteFlyweight() {
    }

    public UnSharedConcreteFlyweight(int high, int weight) {
        this.high = high;
        this.weight = weight;
    }

    public int getHigh() {
        return high;
    }

    public int getWeight() {
        return weight;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
