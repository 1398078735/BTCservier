package com.btc.connect.btcversionzidingyi;

public class Bips {
    private String type;
    private boolean active;
    private long height;

    public Bips(String type, boolean active, long height) {
        this.type = type;
        this.active = active;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }
}
