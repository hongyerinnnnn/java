package com.multi.array;

//2차원 배열
public class ArrayEx3 {

    //2차원배열(행, 열), 선형자료구조
    public void arrayApp1() {
        int[][] m = new int[2][3];//2행3열
        //2차원 배열의 이름은 행 개수를 의미
        //열의주소.length 열의 개수
        for (int i = 0; i < m.length; i++) {//행 개수만큼
            for (int j = 0; j < m[i].length; j++) {//열 개수만큼
                m[i][j] = (int) (Math.random() * 100);
                System.out.println(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void arrayApp2() {
        int[] xx = new int[5];

        xx[0] = 5;
        xx[1] = 6;
        (new int[3])[0]=10;

        (new int[4][5])[0][1]=20;
    }

    public static void main(String[] args) {
        ArrayEx3 m = new ArrayEx3();
        //m.arrayApp1();
        m.arrayApp2();
    }
}
