/**
 * 测试接口的多继承
 */
public class TestInterface2 implements C{

    @Override
    public void testA() {
        System.out.println("TestInterface2.testA");
    }

    @Override
    public void testB() {
        System.out.println("TestInterface2.testB");
    }

    @Override
    public void testC() {
        System.out.println("TestInterface2.testC");
    }

    public static void main(String[] args) {
        C c = new TestInterface2();
        c.testA();
        c.testB();
        c.testC();
    }
}

interface A {
    void testA();
}

interface B {
    void testB();
}

interface C extends A,B {
    void testC();
}
