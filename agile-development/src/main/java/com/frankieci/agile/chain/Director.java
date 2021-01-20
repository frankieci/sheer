package com.frankieci.agile.chain;

public class Director extends Leader {

    private int permissionDays = 3;

    public Director(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < permissionDays) {
            System.out.println("Employee: " + request.getEmpName()
                    + ", request leave: " + request.getLeaveDays() + " days,"
                    + "reason: " + request.getReason());
            System.out.println(" director: " + leaderName + " was Approved");
        } else if (this.nextLeader != null) {
            this.nextLeader.handleRequest(request);
        }
    }

    public void setPermissionDays(int permissionDays) {
        this.permissionDays = permissionDays;
    }
}
