package com.btc.connect;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        BTCService service = new BTCService();
//        int count = service.getBlockCount();
//        String hash = service.getBestBlockHash();
//        String bestaddress = service.getNewAddress();
//        int difficulty = service.getDifficulty();
//        String blockbyhash =service.getBlockByHash();
//        System.out.println(blockbyhash);
//        System.out.println("当前区块难度:"+difficulty);
//        System.out.println("最新地址:"+bestaddress);
//        System.out.println("最新区块的哈希值:"+hash);
//        System.out.println("获取区块的总数:"+count);

//        String helpcommand = service.getBlockCommand();
//        System.out.println(helpcommand);
        String str = service.getBlockChainInfo();
        System.out.println(str);
    }
}
