package com.multi.study;

import java.util.Scanner;

public class Study2 {

    public void study2() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n5. 종료");
            System.out.print("번호를 고르세요: ");
            int num = sc.nextInt();

            if (num == 5) {
                System.out.println("종료합니다.");
                break;
            }

            if (num < 1 || num > 5) {
                System.out.println("잘못된 선택입니다.");
                continue;
            }

            System.out.print("첫 번째 숫자 입력: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자 입력: ");
            int b = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("결과: " + (a + b));
                    break;
                case 2:
                    System.out.println("결과: " + (a - b));
                    break;
                case 3:
                    System.out.println("결과: " + (a * b));
                    break;
                case 4:
                    System.out.println(b == 0 ? "나눌 수 없습니다" : "결과: " + (a / b));
                    break;
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        Study2 s = new Study2();
        s.study2();
    }
}
