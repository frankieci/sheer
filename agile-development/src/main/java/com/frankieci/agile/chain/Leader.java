package com.frankieci.agile.chain;

public abstract class Leader {
    protected String leaderName;
    protected Leader nextLeader;

    public Leader(String leaderName) {
        this.leaderName = leaderName;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest request);
}
