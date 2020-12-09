package com.btc.connect;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JSONArraydemo {
    public static void main(String[] args) {
       JSONObject jsonObject = new JSONObject();
       JSONArray jsonArray = new JSONArray();
       jsonObject.put("name","憨憨");//JSONObject对象中添加键值对
       jsonObject.put("age",18);
       JSONObject jsonObject1 = new JSONObject();
       jsonObject1.put("name","洋");
       jsonArray.add(jsonObject);//将JSONObject对象添加到Json数组中
       jsonArray.add(jsonObject1);
       System.out.println(jsonArray.get(0));
    }
}
