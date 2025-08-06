package com.multi.study;

public class Study0805_4 {
    public void process() {
        int[] m = {10, 20, 30};

        try {
            int result = m[5] / 0; //오류 동시 발생하는 상황임
            System.out.println("결과 : " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 오류");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
    }

    public static void main(String[] args) {
        Study0805_4 s = new Study0805_4();
        s.process();
    }
}
