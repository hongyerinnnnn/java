package com.multi.object.interfaceobj1;

//class(설계도, 사용자정의 자료형)
//inheritance(상속)
public class TV implements RemoteControl, VolumeControl {
    @Override
    public void turnOn() {
        System.out.println("TV turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turn off");
    }

    @Override
    public void volumeUp() {
        System.out.println("TV volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("TV volume down");
    }

    public static void main(String[] args) {
    }
}
