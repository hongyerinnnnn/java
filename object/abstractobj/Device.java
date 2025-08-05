package com.multi.object.abstractobj;
//추상클래스는 확장을 목적으로 만들어진 클래스
public abstract class Device extends Object {
    private String name;

    public Device() {
        super();
    }

    public Device(String name) {
        super();
        this.name = name;
    }

    public void powerIn() {
        int data;//지역변수
    }

    public abstract void operate();

//    public static void main(String[] args) {
//        new Device();
//    }
}
