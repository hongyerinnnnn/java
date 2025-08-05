package com.multi.variable;

public class VariableEx6 {

    public void intValue(int count){
        for(int i=0; i<count; i++) {
            if (i % 7 == 0) System.out.println();
            System.out.println(i);
        }
    }
    public void byteValue(byte x, byte y ){
        double floatValue=7.0;
    }
    public static void main(String[] args) {
        VariableEx6 variableEx6 = new VariableEx6();
     //   variableEx6.intValue(100);
        variableEx6.byteValue((byte)1, (byte)2);
    }
}
