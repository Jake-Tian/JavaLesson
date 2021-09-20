package Homework;

public class Exercise27 {

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

class Parent {
    int num = 300;

    public void show() {
        System.out.println("父类中，show()");
    }


    public Parent() {
        System.out.println("初始化父类对象！");
    }
}

class Child extends Parent {
    int num = 1000;

    public Child() {
        super();
        System.out.println("初始化子类对象！");
    }


    @Override
    public void show() {
        System.out.println("子类中，show()");
        super.show();
        System.out.println("子类中，num：" + num);
        System.out.println("父类中，num：" + super.num);
    }
}
