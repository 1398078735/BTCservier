package com.btc.connect.softutil;

import java.util.ArrayList;
import java.util.List;

public class BlockChaininfo {
    private String chain;
    private int blocks;
    private int headers;
    private String bestblockhash;
    private double difficulty;
    private long mediantime;
    private double verificationprogress;
    private boolean initialblockdownload;
    private String chainwork;
    private long size_on_disk;
    private boolean pruned;
//    private int pruneheight;
//    private boolean automatic_pruning;
//    private long prune_target_size;
    //[]:数组 集合,泛型
    private List<Bip> softforks = new ArrayList<>();
    private BipSoftForks bip_softforks;
    private String warnings;

    public BlockChaininfo(String chain, int blocks, int headers, String bestblockhash, double difficulty, long mediantime, double verificationprogress, boolean initialblockdownload, String chainwork, long size_on_disk, boolean pruned, List<Bip> softforks, BipSoftForks bip_softforks, String warnings) {
        this.chain = chain;
        this.blocks = blocks;
        this.headers = headers;
        this.bestblockhash = bestblockhash;
        this.difficulty = difficulty;
        this.mediantime = mediantime;
        this.verificationprogress = verificationprogress;
        this.initialblockdownload = initialblockdownload;
        this.chainwork = chainwork;
        this.size_on_disk = size_on_disk;
        this.pruned = pruned;
        this.softforks = softforks;
        this.bip_softforks = bip_softforks;
        this.warnings = warnings;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getHeaders() {
        return headers;
    }

    public void setHeaders(int headers) {
        this.headers = headers;
    }

    public String getBestblockhash() {
        return bestblockhash;
    }

    public void setBestblockhash(String bestblockhash) {
        this.bestblockhash = bestblockhash;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public long getMediantime() {
        return mediantime;
    }

    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
    }

    public double getVerificationprogress() {
        return verificationprogress;
    }

    public void setVerificationprogress(double verificationprogress) {
        this.verificationprogress = verificationprogress;
    }

    public boolean isInitialblockdownload() {
        return initialblockdownload;
    }

    public void setInitialblockdownload(boolean initialblockdownload) {
        this.initialblockdownload = initialblockdownload;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public long getSize_on_disk() {
        return size_on_disk;
    }

    public void setSize_on_disk(long size_on_disk) {
        this.size_on_disk = size_on_disk;
    }

    public boolean isPruned() {
        return pruned;
    }

    public void setPruned(boolean pruned) {
        this.pruned = pruned;
    }

    public List<Bip> getSoftforks() {
        return softforks;
    }

    public void setSoftforks(List<Bip> softforks) {
        this.softforks = softforks;
    }

    public BipSoftForks getBip_softforks() {
        return bip_softforks;
    }

    public void setBip_softforks(BipSoftForks bip_softforks) {
        this.bip_softforks = bip_softforks;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }
}
