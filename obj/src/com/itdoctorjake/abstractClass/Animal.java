package com.itdoctorjake.abstractClass;

// 抽象类
public abstract class Animal {

    // 抽象方法
    public abstract void shout();

    public void sleep() {
        System.out.println("Animal.sleep");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.shout();

        // Animal a = new Animal();
    }
}

class Dog extends Animal {
    public void shout() {
        System.out.println("汪汪汪");
    }

    public void watchDoor () {
        System.out.println("Dog.watchDoor");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵");
    }
}
