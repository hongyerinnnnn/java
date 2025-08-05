package com.multi.object.base;

public class Person2 {
    private String name;
    private int age;
    private String address;

    public void setName(String name){
        System.out.println("this=" + this);
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        Person2 p1 = new Person2();//name, age. address
        Person2 p2 = new Person2();//name, age, address
        System.out.println("p1= " + p1);
        System.out.println("p2= " + p2);
        p1.setName("ddd");
        p2.setName("ddd");
        System.out.println(p2.getName());
    }
}
