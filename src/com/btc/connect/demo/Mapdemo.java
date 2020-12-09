package com.btc.connect.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapdemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        //向map中存数据
        map.put("name", "憨憨");
        map.put("age", "18");

        //从map中取数据//map的遍历
       Set<String> keys = map.keySet();//把所有的key取出来
        for(String key: keys){
            System.out.println(key);
            String  value = map.get(key);//根据key取值
            System.out.println(value);
        }

    }
}
