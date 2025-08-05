package com.multi.study;

import java.util.Scanner;
import java.util.Random;

public class Study4 {

    public void study4() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int answer = rand.nextInt(100) + 1; // 1~100
        int count = 0;
        boolean correct = false;

        while (true) {
            System.out.print("숫자를 추측해보세요 (1~100): ");
            int guess = sc.nextInt();
            count++;

            if (guess < answer) {
                System.out.println("더 큰 수입니다.");
            } else if (guess > answer) {
                System.out.println("더 작은 수입니다.");
            } else {
                correct = true;
                break;
            }
        }

        if (correct) {
            System.out.println("정답입니다! 시도 횟수: " + count + "회");
        }

        sc.close();
    }

    public static void main(String[] args) {
        Study4 s = new Study4();
        s.study4();
    }
}
