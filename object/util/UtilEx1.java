package com.multi.object.util;

//util과 관련된 class
//String, StringBuffer, StringBuilder
//Object(기능은 모든 객체의 공통기능이다)
//Collection, Thread
public class UtilEx1 {

    public void StringMaker1() {
        //생성자 관련 코드
        byte[] byteValue = {65, 66, 67, 68, 69};
        String strByte = new String(byteValue);
        System.out.println(strByte);
    }

    public void StringMaker2() {
        String str1 = new String("abcd");
        String str2 = new String("Spring");
        System.out.println(str1.charAt(0));
        System.out.println(str2.charAt(0));
        System.out.println(str1.equals("abcd"));
        System.out.println(str1.indexOf(97));
        System.out.println(str1.codePointAt(0));
    }

    public static void main(String[] args) {
        UtilEx1 obj = new UtilEx1();
        obj.StringMaker1();
        obj.StringMaker2();
    }

}
