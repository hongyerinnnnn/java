package com.multi.study;

import java.util.Scanner;

public class Study3 {

    public void study3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 N을 입력하세요 (3 이상, 홀수 권장): ");
        int n = sc.nextInt();

        if (n < 3 || n % 2 == 0) {
            System.out.println("3 이상의 홀수를 입력해야 합니다.");
            return;
        }

        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }

        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (n - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
    public static void main(String[] args) {
        Study3 s = new Study3();
        s.study3();
    }
}
