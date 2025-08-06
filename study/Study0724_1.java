package com.multi.study;

import java.util.Scanner;

public class Study0724_1 {
    public void study1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        int score = sc.nextInt();
        String grade = (score >= 90) ? "A" :
                (score >= 80) ? "B" :
                        (score >= 70) ? "C" :
                                (score >= 60) ? "D" : "F";
        System.out.println("당신의 등급은 " + grade + "입니다.");
        sc.close();
    }

    public static void main(String[] args) {
        Study0724_1 s = new Study0724_1();
        s.study1();
    }
}
