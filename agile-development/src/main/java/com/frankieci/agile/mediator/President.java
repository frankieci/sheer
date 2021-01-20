package com.frankieci.agile.mediator;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class President implements Mediator {

    private Map<String, Department> departmentMap = new ConcurrentHashMap<>();

    @Override
    public void register(String name, Department department) {
        departmentMap.put(name, department);
    }

    @Override
    public void command(String name) {
        Department department = departmentMap.get(name);
        department.transmit();
    }
}
