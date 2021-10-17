package Homework.Exercise29;

public class Animal {
    public void shout() {
        System.out.println("Animal.shout");
    }
}

class Dog extends Animal {

    public void shout() {
        System.out.println("汪汪汪！");
    }

    public void watchDoor() {
        System.out.println("Dog.watchDoor");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵！");
    }
}
