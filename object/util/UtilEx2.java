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
                .append("ghi")
                .append("ikk");
        System.out.println(sb==imsi);//true
    }

    public static void main(String[] args) {
        UtilEx2 utilEx2=new UtilEx2();
        utilEx2.stringExecute2();
    }
}
