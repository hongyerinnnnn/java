package com.multi.object.base;
//객체는 기능을 갖고있는 데이터이다.
// 객체(속성, 기능)
//생성자(Constructor)
//생성자의 이름  = 클래스 이름
//결과형이 없음

//생성자는 자동호출
public class Person3 {
    private String name;
    private int age;
    private String address;
    public Person3(){//defaultConstructor
        System.out.println("Person3 constructor");
    }

    public Person3(String name){
        System.out.println("Person3 constructor String name" );
    }
    public static void main(String[] args) {
        Person3 p1 = new Person3();//name, age, address

    }

}
