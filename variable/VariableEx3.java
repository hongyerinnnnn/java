package com.multi.variable;

public class VariableEx3 {
    public static void main(String[] args) {
        System.out.println("Byte Min-Max"+Byte.MAX_VALUE+"~"+Byte.MAX_VALUE);
        System.out.println("Character Min-Max"+Character.MIN_VALUE+"~"+Character.MIN_VALUE);
        System.out.println("Double Min-Max"+Double.MAX_VALUE+"~"+Double.MAX_VALUE);
        System.out.println("Float Min-Max"+Float.MAX_VALUE+"~"+Float.MAX_VALUE);
        System.out.println("Integer Min-Max"+Integer.MAX_VALUE+"~"+Integer.MAX_VALUE);
        System.out.println("Long Min-Max"+Long.MAX_VALUE+"~"+Long.MAX_VALUE);
        System.out.println("Short Min-Max"+Short.MAX_VALUE+"~"+Short.MAX_VALUE);

        byte byteValue = 5;
        short shortValue = 50;
        //byteValue = shortValue; 큰 바이트에게서 작은 바이트에게로 이동이 불가
        shortValue = byteValue;

        //변수 (지역변수, 인스턴스변수, 정적변수)


    }
}
