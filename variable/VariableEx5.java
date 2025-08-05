package com.multi.variable;

//Java는 객체지향언어
public class VariableEx5 { // 객체를 설계하는 설계

    //속성 + 기능
    short value; //heap에 할당
    boolean isCheck;
    static int staticData;
    public void sayMethod() { //method
        int localSay = 100; //지역변수 stack
    }

    public void eatMethod() {
        isCheck = true;
    }

    public static void main(String[] args){
    VariableEx5 v = new VariableEx5();
    v.sayMethod();
    v.value = 99;
    staticData = 45;
    }

}
