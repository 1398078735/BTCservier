package com.btc.connect.btcversionzidingyi;

public class Softutil {
    private Bips bip34;
    private Bips bip66;
    private Bips bip65;
    private Bips csv;
    private Bips segwit;

    public Softutil(Bips bip34, Bips bip66, Bips bip65, Bips csv, Bips segwit) {
        this.bip34 = bip34;
        this.bip66 = bip66;
        this.bip65 = bip65;
        this.csv = csv;
        this.segwit = segwit;
    }

    public Bips getBip34() {
        return bip34;
    }

    public void setBip34(Bips bip34) {
        this.bip34 = bip34;
    }

    public Bips getBip66() {
        return bip66;
    }

    public void setBip66(Bips bip66) {
        this.bip66 = bip66;
    }

    public Bips getBip65() {
        return bip65;
    }

    public void setBip65(Bips bip65) {
        this.bip65 = bip65;
    }

    public Bips getCsv() {
        return csv;
    }

    public void setCsv(Bips csv) {
        this.csv = csv;
    }

    public Bips getSegwit() {
        return segwit;
    }

    public void setSegwit(Bips segwit) {
        this.segwit = segwit;
    }
}
