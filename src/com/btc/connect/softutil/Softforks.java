package com.btc.connect.softutil;

import com.btc.connect.softutil.*;

public class Softforks {
    private Bip34 bip34;
    private Bip66 bip66;
    private Bip65 bip65;
    private Csv csv;
    private Segwit segwit;

    public Softforks(Bip34 bip34, Bip66 bip66, Bip65 bip65, Csv csv, Segwit segwit) {
        this.bip34 = bip34;
        this.bip66 = bip66;
        this.bip65 = bip65;
        this.csv = csv;
        this.segwit = segwit;
    }

    public Bip34 getBip34() {
        return bip34;
    }

    public void setBip34(Bip34 bip34) {
        this.bip34 = bip34;
    }

    public Bip66 getBip66() {
        return bip66;
    }

    public void setBip66(Bip66 bip66) {
        this.bip66 = bip66;
    }

    public Bip65 getBip65() {
        return bip65;
    }

    public void setBip65(Bip65 bip65) {
        this.bip65 = bip65;
    }

    public Csv getCsv() {
        return csv;
    }

    public void setCsv(Csv csv) {
        this.csv = csv;
    }

    public Segwit getSegwit() {
        return segwit;
    }

    public void setSegwit(Segwit segwit) {
        this.segwit = segwit;
    }
}
