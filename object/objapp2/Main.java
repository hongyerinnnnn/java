package com.multi.object.objapp2;

// Pet 인터페이스
interface Pet {
    void play();
}

// Robot 인터페이스
interface Robot {
    void performTask();
}

// Animal 클래스
abstract class Animal {
    abstract void makeSound();
}

// Feline 클래스 (Animal의 서브클래스)
abstract class Feline extends Animal {
    void makeSound() {
        System.out.println("Feline sound!");
    }
}

// Canine 클래스 (Animal의 서브클래스)
abstract class Canine extends Animal {
    void makeSound() {
        System.out.println("Canine sound!");
    }
}

// Cat 클래스 (Feline의 서브클래스)
class Cat extends Feline implements Pet {
    public void play() {
        System.out.println("Cat is playing!");
    }

    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Lion 클래스 (Feline의 서브클래스)
class Lion extends Feline {
    @Override
    void makeSound() {
        System.out.println("Roar");
    }
}

// Tiger 클래스 (Feline의 서브클래스)
class Tiger extends Feline {
    @Override
    void makeSound() {
        System.out.println("Growl");
    }
}

// Dog 클래스 (Canine의 서브클래스)
class Dog extends Canine implements Pet {
    public void play() {
        System.out.println("Dog is playing!");
    }

    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Wolf 클래스 (Canine의 서브클래스)
class Wolf extends Canine {
    @Override
    void makeSound() {
        System.out.println("Howl");
    }
}

// Hippo 클래스 (Animal의 서브클래스)
class Hippo extends Animal {
    @Override
    void makeSound() {
        System.out.println("Hippo sound");
    }
}

// RoboDog 클래스 (Pet 및 Robot 인터페이스를 구현)
class RoboDog implements Robot, Pet {
    public void play() {
        System.out.println("RoboDog is playing!");
    }

    @Override
    public void performTask() {
        System.out.println("RoboDog is performing a task.");
    }
}

// 테스트 클래스
public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();
        Pet roboDog = new RoboDog();

        cat.play();
        dog.play();
        roboDog.play();

        Animal lion = new Lion();
        lion.makeSound();

        Animal tiger = new Tiger();
        tiger.makeSound();

        Animal hippo = new Hippo();
        hippo.makeSound();

        // Robot 기능 테스트
        Robot robotDog = new RoboDog();
        robotDog.performTask();
    }
}
