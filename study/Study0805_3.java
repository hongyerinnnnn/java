package com.multi.study;

import java.util.Scanner;

public class Study0805_3 {
    public void nullpoint() {
        String str = null;
        try {
            int length = str.length();
            System.out.println(" 문자열 길이 " + length);
        } catch (NullPointerException e) {
            System.out.println("문자열이 null입니다");
        }
    }

    public static void main(String[] args) {
        Study0805_3 s = new Study0805_3();
        s.nullpoint();
    }
}
