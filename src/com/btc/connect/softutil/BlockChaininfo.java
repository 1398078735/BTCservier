package com.btc.connect.softutil;

public class BlockChaininfo {
    private String chain;
    private String blocks;
    private String headers;
    private String bestblockhash;
    private String difficulty;
    private String mediantime;
    private String verificationprogress;
    private String initialblockdownload;
    private String chainwork;
    private String size_on_disk;
    private String pruned;
    private String pruneheight;
    private String automatic_pruning;
    private String prune_target_size;
    private Softforks softforks;
    private String warnings;

    public BlockChaininfo() {
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

    public String getBlocks() {
        return blocks;
    }

    public void setBlocks(String blocks) {
        this.blocks = blocks;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getBestblockhash() {
        return bestblockhash;
    }

    public void setBestblockhash(String bestblockhash) {
        this.bestblockhash = bestblockhash;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getMediantime() {
        return mediantime;
    }

    public void setMediantime(String mediantime) {
        this.mediantime = mediantime;
    }

    public String getVerificationprogress() {
        return verificationprogress;
    }

    public void setVerificationprogress(String verificationprogress) {
        this.verificationprogress = verificationprogress;
    }

    public String getInitialblockdownload() {
        return initialblockdownload;
    }

    public void setInitialblockdownload(String initialblockdownload) {
        this.initialblockdownload = initialblockdownload;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public String getSize_on_disk() {
        return size_on_disk;
    }

    public void setSize_on_disk(String size_on_disk) {
        this.size_on_disk = size_on_disk;
    }

    public String getPruned() {
        return pruned;
    }

    public void setPruned(String pruned) {
        this.pruned = pruned;
    }

    public String getPruneheight() {
        return pruneheight;
    }

    public void setPruneheight(String pruneheight) {
        this.pruneheight = pruneheight;
    }

    public String getAutomatic_pruning() {
        return automatic_pruning;
    }

    public void setAutomatic_pruning(String automatic_pruning) {
        this.automatic_pruning = automatic_pruning;
    }

    public String getPrune_target_size() {
        return prune_target_size;
    }

    public void setPrune_target_size(String prune_target_size) {
        this.prune_target_size = prune_target_size;
    }

    public Softforks getSoftforks() {
        return softforks;
    }

    public void setSoftforks(Softforks softforks) {
        this.softforks = softforks;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }
}
