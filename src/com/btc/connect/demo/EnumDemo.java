package com.btc.connect.demo;

public class EnumDemo {
    public static void main(String[] args) {
        printWeekDay(Week.MONDAY);

    }

    public static void printWeekDay(Week week){
        switch (week){
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
        }
    }
}
