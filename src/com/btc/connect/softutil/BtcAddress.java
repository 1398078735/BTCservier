package com.btc.connect.softutil;

//比特币地址类型的枚举，一共有三种
//标识符：标识符只能由字符数字，下划线，$组成，不能以数字开头
public enum BtcAddress {
    LEGACY,
    P2SHSEGWIT,
    BECH32,
}
