package com.btc.connect.softutil;

public class Segwit {
    private String type;
    private String active;
    private String height;

    public Segwit(String type, String active, String height) {
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
