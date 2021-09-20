public class TestSuper {
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
}

class Child extends Parent {
    int num = 1000;

    @Override
    public void show() {
        System.out.println("子类中，show()");
        super.show();
        System.out.println("子类中，num: "+num);
        System.out.println("父类的num：" + super.num);
    }
}