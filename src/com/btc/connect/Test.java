package com.btc.connect;

import com.btc.connect.btcversionzidingyi.ChaninIfo;
import com.btc.connect.btcversionzidingyi.Softutil;
import com.btc.connect.softutil.BtcAddress;

public class Test {

    public static void main(String[] args) {
        BTCService service = new BTCService();
        String hash = service.getBlockHashByHeight(0);
        System.out.println(hash);
//        int count = service.getBlockCount();
//        String hash = service.getBestBlockHash();
        String bestaddress = service.getNewAddress("zlh",BtcAddress.LEGACY);
//        int difficulty = service.getDifficulty();
//        String blockbyhash =service.getBlockByHash();
//        System.out.println(blockbyhash);
//        System.out.println("当前区块难度:"+difficulty);
        System.out.println("最新地址:"+bestaddress);
//        System.out.println("最新区块的哈希值:"+hash);
//        System.out.println("获取区块的总数:"+count);

//        String helpcommand = service.getBlockCommand();
//        System.out.println(helpcommand);
        //取出集合中的每一个成员，遍历
//            for (Bip bip : bigList){
//                //System.out.println(bip.getId());
//            }
        ChaninIfo str = service.getBlockChainInfo();
        if (str != null) {
            System.out.println(str.getHeaders());
            System.out.println(str.getDifficulty());
            Softutil softutil = str.getSoftforks();
            System.out.println(softutil.getBip34().getHeight());
        }

        Long time = service.getBlockServerTime();
        System.out.println(time);


    }
}
