package com.frankieci.agile.singleton;

public interface DataBase<T> {

    T read(String name);

    void write(T t);
}
