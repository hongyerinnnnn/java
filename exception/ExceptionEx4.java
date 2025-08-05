package com.multi.exception;

import java.io.IOException;

public class ExceptionEx4 {
    public void exceptionEx1() throws InterruptedException, IOException, CloneNotSupportedException {
        Thread.sleep(1000);//compileException
        System.in.read();
        this.clone();
    }

    public static void main(String[] args) throws InterruptedException, IOException, CloneNotSupportedException {
        ExceptionEx4 e = new ExceptionEx4();

        e.exceptionEx1();
    }
}
