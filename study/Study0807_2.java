package com.multi.study;

import java.util.HashSet;
import java.util.Scanner;

public class Study0807_2 {
    Scanner sc = new Scanner(System.in);

    public void numbers() {
        HashSet<Integer> m = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "번째 숫자 입력 : ");
            int num = sc.nextInt();
            m.add(num);

        }
        System.out.println("중복 제거한 숫자 목록 : " + m);
    }

    public static void main(String[] args) {
        Study0807_2 s = new Study0807_2();
        s.numbers();
    }
}
