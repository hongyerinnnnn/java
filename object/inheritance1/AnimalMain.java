package com.multi.object.inheritance1;

public class AnimalMain {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        dog.eat();
//        cat.eat();

        Animal animal = new Dog();

        animal = new Cat();
        animal.eat();
    }
}
