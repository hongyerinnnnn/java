package com.multi.object.interfaceobj1;

// Interface는 완전 추상클래스
// 속성이 final static
public interface RemoteControl {
    public int value = 100;//상수만
    public abstract void turnOn();
    public abstract void turnOff();
}
