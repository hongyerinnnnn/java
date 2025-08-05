package com.multi.variable;

public class VariableEx4 {
    public void byteValue(){
        byte byteGab = 10;
        System.out.println("byteValueMethod Call");
    }
    public void shortValue(){
        //byteGab = 20; 메소드 안에서는 지역변수로 접근 불가
        System.out.println("ShortValueMethod Call");
    }
    public static void main(String[] args) {
        int i = 10;
        VariableEx4 v = new VariableEx4();
        v.shortValue();
        v.byteValue();
    }
}
//그냥 위에 static을 주면 안되나?
// 그럼 바로 호출되는거 아님?