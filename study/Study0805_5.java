package com.multi.study;

public class Study0805_5 {
    public static void level1() throws Exception {
        level2(); //예외 전파? > 다시 호출자에게 넘김
    }
    public static void level2() throws Exception {
        throw new Exception("문제 발생");
    } //level2()를 호출하면 무조건 Exception 발생! 왜....?

    public static void main(String[] args) {
        try{
            level1();
        }catch(Exception e){
            System.out.println("예외 처리 : " + e.getMessage());
        }
    }
}
