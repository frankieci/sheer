package com.baciSmile.eureka.client.pojo;

public class Product {

    private int id;

    private String name;

    private int price;

    private int store;

    public Product() {
    }

    public Product(int id, String name, int price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStore() {
        return store;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStore(int store) {
        this.store = store;
    }
}
