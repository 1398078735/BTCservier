package com.btc.connect.constants;

import com.btc.connect.softutil.BtcAddress;

public class Constants {
    //rpc服务协议
    public static final String RPCUSER = "user";
    public static final String RPCPASSWORD = "pwd";
    public static final String RPCURL = "http://127.0.0.1:8332";
    //地址类型
    public static final String ADDRESS_LEGACY="legacy";
    public static final String ADDRESS_P2SH_SEGWIT="p2sh-segwit";
    public static final String ADDRESS_BECH32="bach32";
    //rpc服务命令
    public static final String GETBLOCKCOUNT = "getblockcount";
    public static final String GETBESTBLOCKHASH = "getbestblockhash";
    public static final String GETNEWADDRESS = "getnewaddress";
    public static final String GETDIFFICULTY = "getdifficulty";
    public static final String GETBLOCKBYHASH = "getblock";
    public static final String GETBLOCKCHAININFO = "getblockchaininfo";
    public static final String GETWALLETINFO = "getwalletinfo";
    public static final String GETBLOCKHASHBYHEIGHT = "getblockhash";
    public static final String GETBLOCKCOMMAND = "help";
    public static final String GETBLOCKSERVERTIME = "uptime";
    public static final String GETSETTXFEE = "settxfee";
    public static final String GETSETLABEL = "setlabel";
    public static final String GETABORTRESCAN = "abortrescan";
    public static final String GETVERIFYMESSAGE = "verifymessage";
    public static final String GETPING = "ping";



    /***
     * 该方法用于根据枚举类型返回对饮的比特币地址的类型对应的字符串
     * @param type 枚举
     * @return 比特币地址类型字符串形式
     */
    public static String getAddressType(BtcAddress type){
        switch (type){
            case LEGACY:
                return ADDRESS_LEGACY;
            case BECH32:
                return ADDRESS_BECH32;
            case P2SHSEGWIT:
                return ADDRESS_P2SH_SEGWIT;
            default:
                return null;
        }
    }
}
