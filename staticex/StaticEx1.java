package com.multi.staticex;

public class StaticEx1 {
    int inum;
    static int sNum;

    public void increment(StaticEx1 this) {
        int localNum = 0;
        localNum++; // 지역변수
        this.inum++;
        StaticEx1.sNum++; // 클래스 로딩시 단 한번만 생성
        System.out.println("localNum = " + localNum + " inum = " + inum + " sNum = " + sNum);
    }

    public static void main(String[] args) {
        StaticEx1 s1 = new StaticEx1();
        StaticEx1 s2 = new StaticEx1();
        s1.increment();// 1 1 1
        s1.increment();// 1 2 2
        s2.increment();// 1 1 3
    }
}
