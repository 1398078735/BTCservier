package com.btc.connect.demo;

import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Type;

public class JSONDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);

        //序列化
        JSONObject object = (JSONObject) JSONObject.toJSON(student);
        String objStr = object.toJSONString();
        System.out.println(objStr);

        //反序列化
        Student laowang = JSONObject.parseObject(objStr, Student.class);
        System.out.println(laowang.age);

        //第二种序列化的方式
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","憨憨");
        jsonObject.put("age",18);
        //序列化
        String coderJson = jsonObject.toJSONString();
        System.out.println(coderJson);
    }

    static class Student{
        private int age;

        public Student() {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
