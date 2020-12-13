package com.btc.connect.softutil;

public class Bip {
    private String id;
    private String version;
    private Reject reject;

    public Bip(String id, String version, Reject reject) {
        this.id = id;
        this.version = version;
        this.reject = reject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Reject getReject() {
        return reject;
    }

    public void setReject(Reject reject) {
        this.reject = reject;
    }
}
