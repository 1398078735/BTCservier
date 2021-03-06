package com.btc.connect.btcversionzidingyi;


public class ChaninIfo {
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
        private int pruneheight;
        private boolean automatic_pruning;
        private long prune_target_size;
        private Softutil softforks;
        private String warnings;

    public ChaninIfo(String chain, int blocks, int headers, String bestblockhash, double difficulty, long mediantime, double verificationprogress, boolean initialblockdownload, String chainwork, long size_on_disk, boolean pruned, int pruneheight, boolean automatic_pruning, long prune_target_size, Softutil softforks, String warnings) {
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
        this.pruneheight = pruneheight;
        this.automatic_pruning = automatic_pruning;
        this.prune_target_size = prune_target_size;
        this.softforks = softforks;
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

    public int getPruneheight() {
        return pruneheight;
    }

    public void setPruneheight(int pruneheight) {
        this.pruneheight = pruneheight;
    }

    public boolean isAutomatic_pruning() {
        return automatic_pruning;
    }

    public void setAutomatic_pruning(boolean automatic_pruning) {
        this.automatic_pruning = automatic_pruning;
    }

    public long getPrune_target_size() {
        return prune_target_size;
    }

    public void setPrune_target_size(long prune_target_size) {
        this.prune_target_size = prune_target_size;
    }

    public Softutil getSoftforks() {
        return softforks;
    }

    public void setSoftforks(Softutil softforks) {
        this.softforks = softforks;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }
}

