package com.multi.control;

public class ControlEx2 {
    //if, if else, if elseif else, for, while, do-while, break, continue, return

    public void loopEx1() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("홍예린");
//
//        for (int i = 1; i <= 10; i++)
//            System.out.println("홍예린");
//        System.out.println("홍");

    }

    public void loopEx2() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + (i*j) + "\t");
            }
            System.out.println();
        }
    }

    public void loopEx3(){
        int i=1, j=2;
        while(i<=9){
            while(j<=9){
                System.out.print(j + " * " + i + " = " + (i*j) + "\t");
                j++;
            }
            j=2;
            i++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        ControlEx2 c = new ControlEx2();
        c.loopEx1();
        c.loopEx2();
        c.loopEx3();
    }
}
