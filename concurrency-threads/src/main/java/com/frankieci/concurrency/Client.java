package com.frankieci.concurrency;

import java.util.Collection;

public class Client {

    public static void main(String[] args) {
        ThreadService threadService = new ThreadService();
        threadService.execute(() -> {
            //load a heavy resources
            while (true) {

            }
        }, "my");
        threadService.shutdown(1_000);
    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }

}
