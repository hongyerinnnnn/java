package com.multi.study;

import java.util.Scanner;

class InvaildAgeException extends Exception {
    public InvaildAgeException(int age) {
        super("유효하지 않은 나이입니다 : " + age);
    }
}

public class Study0805_2 {
    Scanner sc = new Scanner(System.in);

    public void Age() {
        System.out.println("나이 입력 : ");
        int age = sc.nextInt();

        try {
            if (age <= 0) {
                throw new InvaildAgeException(age);
            } else {
                System.out.println("입력한 나이 : " + age);
            }
        } catch (InvaildAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Study0805_2 s = new Study0805_2();
        s.Age();
    }
}
