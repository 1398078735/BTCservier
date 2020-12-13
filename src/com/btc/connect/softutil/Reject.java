package com.btc.connect.softutil;

public class Reject {
    private boolean status;

    public Reject(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
