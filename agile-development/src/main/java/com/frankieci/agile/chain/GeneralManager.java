package com.frankieci.agile.chain;

public class GeneralManager extends Leader {

    private int permissionDays = 30;

    public GeneralManager(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < permissionDays) {
            System.out.println("Employee: " + request.getEmpName()
                    + ", request leave: " + request.getLeaveDays() + " days,"
                    + "reason: " + request.getReason());
            System.out.println(" GeneralManager: " + leaderName + " was Approved");
        } else {
            System.out.println("Not permission!");
        }
    }

    public void setPermissionDays(int permissionDays) {
        this.permissionDays = permissionDays;
    }
}
