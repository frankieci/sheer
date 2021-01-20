package com.frankieci.agile.chain;

public class Client {
    public static void main(String[] args) {
        Leader director = new Director("Joy");
        Leader manager = new Manager("Frankie");
        Leader generalManager = new GeneralManager("Morry");
        //组织责任链关系
        director.setNextLeader(manager);
        manager.setNextLeader(generalManager);

        LeaveRequest request = new LeaveRequest("Tom", 3, "回英国省亲");
        director.handleRequest(request);
    }
}
