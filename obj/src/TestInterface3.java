/**
 * 测试接口的：默认方法、静态方法
 */
public class TestInterface3 {
    public static void main(String[] args) {
        TestA ta = new TestA();
        ta.more1();

        A1.staticMethod();      // 通过接口名称直接调用静态方法
        TestA.staticMethod();   // 调用实现类的静态方法

        TestB tb = new TestB();
        tb.more1();
    }
}

interface A1 {

    default void more1() {
        System.out.println("A1.more1");
    }

    default void more2() {
        System.out.println("A1.more2");
    }

    static void staticMethod() {
        System.out.println("A1.staticMethod");
    }
}

interface B1 {
    default void more1() {
        System.out.println("B1.more1");
    }
}

class TestA implements A1 {
    @Override
    public void more1() {
        System.out.println("TestA.more1");
    }

    static void staticMethod() {
        System.out.println("TestA.staticMethod");
    }
}

class TestB implements A1,B1 {
    @Override
    public void more1() {
        System.out.println("TestB.more1");
    }
}