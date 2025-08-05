package com.multi.exception;

import java.io.IOException;

//try, catch, finally
//CompileException

public class ExceptionEx3 implements Cloneable{
    public Object getData() {
        return 1;
    }

    public void interruptedException() {
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0) System.out.println();
            try {
                Thread.sleep(100);
                System.out.println("입력값");
                System.out.println((char) System.in.read());
                this.clone();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            System.out.println(i + "\t");
        }
    }

    public static void main(String[] args) {
        ExceptionEx3 e = new ExceptionEx3();
        e.interruptedException();
    }
}
