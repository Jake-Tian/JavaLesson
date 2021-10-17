package Homework.Exercise29;

public class TestPolym {
    public static void main(String[] args) {

        Dog d = new Dog();
        animalCry(d);

        Cat c = new Cat();
        animalCry(c);

        // 对象的转型
        Animal a = new Dog();
        a.shout();
        // a.watchDoor();

        // 强制转型
        Dog a2 = (Dog) a;
        a2.watchDoor();
        // Cat a3 = (Cat) a;    // 运行时报错：java.lang.ClassCastException
    }

    static void animalCry(Animal a) {
        System.out.println("step1");
        a.shout();      // 多态的三个必要条件：继承、方法的重写、父类引用指向子类对象
        System.out.println("step2");
    }
}
