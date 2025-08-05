package com.multi.operator;
//변수, 연산자, 제어문, 배열
public class OperatorEx1 {
//연산자 -> 계산을 목적으로 사용되는 기호
//최우선[] . () 단항++ + ! - -- ~ 산술 쉬프트 관계 논리연산자 삼항연산자
//대입연산자 콤마연산자
    public void firstOperator(int x, int y, int k){
        System.out.println(!(x>y)?x+y*k:(x+y)*k);
    }
    public void logicalOperator(int x, int y, int k, int z){
//        boolean isState = ++x>y--&&  k++
    }
    public static void main(String[] args) {
        OperatorEx1 o = new OperatorEx1();
        o.logicalOperator(1, 2, 3, 4);
//        o.firstOperator(1,2,3);
    }
}
