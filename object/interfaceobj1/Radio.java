package com.multi.object.interfaceobj1;

public class Radio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Radio On");
    }
    @Override
    public void turnOff() {
        System.out.println("Radio Off");
    }
}
