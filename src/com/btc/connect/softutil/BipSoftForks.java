package com.btc.connect.softutil;

public class BipSoftForks {
    private SoftFork csv;
    private SoftFork segwit;

    public BipSoftForks(SoftFork csv, SoftFork segwit) {
        this.csv = csv;
        this.segwit = segwit;
    }

    public SoftFork getCsv() {
        return csv;
    }

    public void setCsv(SoftFork csv) {
        this.csv = csv;
    }

    public SoftFork getSegwit() {
        return segwit;
    }

    public void setSegwit(SoftFork segwit) {
        this.segwit = segwit;
    }
}
