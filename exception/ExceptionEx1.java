package com.multi.exception;

//Exception은 예외 (Compile | RunTime)
public class ExceptionEx1 {
    public void nullPointerExceptionExample1(String str) {
        //String str = null;
        str = str.charAt(0) != 'A' ? null : str;
        System.out.println(str.startsWith("Ajax"));//Ajax문자열로 시작한다면 true 출력
    }

    public void arrayIndexOutOfBoundsExceptionExample1() {
        int[] m = new int[5];
        for (int i = 0; i <= 5; i++) {
            try {
                m[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
                // e.printStackTrace();

            } finally {
                System.out.println("final");
            }

        }
    }

    public void arithmeticExceptionExample1() {
        int[] m = new int[5];
        int result = 0;
        for (int i = 0; i <= 5; i++) {
            try {
                m[i] = (int) Math.random() * 100;
                result = 100 / m[i];
            } catch (ArithmeticException e) {

            } catch (NullPointerException e) {

            } catch (Exception e) {

            } catch (Throwable e) {

            }
        }
    }

    public static void main(String[] args) {
        ExceptionEx1 obj = new ExceptionEx1();
        // obj.nullPointerExceptionExample1("AjaxLesson");
        //obj.arrayIndexOutOfBoundsExceptionExample1();
        obj.arithmeticExceptionExample1();
    }
}
