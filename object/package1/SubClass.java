package com.multi.object.package1;

public class SubClass extends SuperClass {
    public SubClass(){
        //SuperClass의 후손 생성자
        this.publicData = 100;
        this.protectedData = 200;
        this.defaultData = 300;

    }
}
