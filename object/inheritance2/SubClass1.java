package com.multi.object.inheritance2;

//객체를 유기적으로 연결한 것을 상속이라함
public class SubClass1 extends SuperClass {
    private int subClassValue;

    public SubClass1(int superClassValue, int subClassValue) {
        super(superClassValue);
        this.subClassValue = subClassValue;
    }

    @Override
    public String toString() {
        return super.toString() + " " + String.valueOf(this.subClassValue);
    }
}
