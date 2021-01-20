package com.frankieci.agile.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.request(new FreeState());
        context.request(new OccupiedState());
    }
}
