package com.multi.staticex;

public class StaticEx4 {
    private int value;
    private int num;
    private String str;
    private double count;

    public void increment() {
        this.count++;
    }

    public static void message() {
        System.out.println("안녕");
    }

    public static void main(String[] args) {
        StaticEx4 staticEx4 = new StaticEx4();
        StaticEx4.message();
    }
}
