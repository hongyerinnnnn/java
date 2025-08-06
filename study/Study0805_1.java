package com.multi.study;

import java.util.Scanner;

public class Study0805_1 {
    Scanner sc = new Scanner(System.in);

    public void divide() {
        System.out.println("첫 번째 정수 입력 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 정수 입력 : ");
        int b = sc.nextInt();
        try {
            int result = a / b;
            System.out.println("나눗셈 결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        } finally {
            System.out.println("계산 종료");
        }
    }

    public static void main(String[] args) {
        Study0805_1 s = new Study0805_1();
        s.divide();
    }
}
