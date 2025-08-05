package com.multi.staticex;

public class StaticEx3Main {

    public static void main(String[] args) {
        //new StaticEx3(); 접근제한
        StaticEx3.getStaticEx3().setValue(100);
        System.out.println(StaticEx3.getStaticEx3().getValue());
    }
}
