package com.multi.object.base;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OverloadingEx2 {

    public void print(int x){
        System.out.println("print int: " + x);
    }

    public void print(long xx){
        System.out.println("print long: " + xx);
    }
    public void print(int x, long xx){
        System.out.println("print int long: ");
    }
    public static void main(String[] args) {
        OverloadingEx2 o = new OverloadingEx2();
       // o.print(100 , 200);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    }
}
