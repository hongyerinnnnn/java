package com.multi.object.util;

public class UtilEx2 {
    //String,StringBufer,StirngBuilder 차이점
    public void stringExecute1(){
        String str1="abc";//암시적 선언
        String imsi=str1;
        str1+="def";
        System.out.println(str1==imsi);//false
    }
    public void stringExecute2(){
        StringBuffer sb=new StringBuffer("abc");
        StringBuffer imsi=sb;

        sb.append("def")
                .append("ghi");
        System.out.println(sb);
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb);

        //System.out.println(sb==imsi);//true
    }
    public void stringExecute3(){
        StringBuilder sb=new StringBuilder("abc");
        sb.append("def").append("g");
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);


    }
    public static void main(String[] args) {
        UtilEx2 utilEx2=new UtilEx2();
        utilEx2.stringExecute3();
    }
}