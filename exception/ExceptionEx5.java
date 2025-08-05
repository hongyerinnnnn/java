package com.multi.exception;

import java.util.Scanner;

public class ExceptionEx5 extends Exception {
    Scanner scanner = new Scanner(System.in);

    public ExceptionEx5() {
        super("글자는 3글자 이상만 가능하다");//선조생성자(Exception)인자가 String인 생성자가 있음

    }

    public void menu() {
        System.out.println("Message");
        String message = scanner.next();
        if (message.length() < 3) {
            try {
                throw new ExceptionEx5();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }//if문
        System.out.println(message);
    }

    public static void main(String[] args) {
        ExceptionEx5 e = new ExceptionEx5();
        e.menu();
    }
}
