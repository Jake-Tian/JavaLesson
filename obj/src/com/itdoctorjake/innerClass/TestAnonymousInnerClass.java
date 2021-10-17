package com.itdoctorjake.innerClass;

/**
 * 测试匿名内部类
 */
public class TestAnonymousInnerClass {

    public void test(A3 a) {
        System.out.println("TestAnonymousInnerClass.test");
        a.run();
    }

    public static void main(String[] args) {
        TestAnonymousInnerClass tc = new TestAnonymousInnerClass();

        // 匿名内部类只使用一次
        tc.test(new A3() {
            @Override
            public void run() {
                System.out.println("匿名内部类的run()");
            }
        });

        tc.test(new A3() {
            @Override
            public void run() {
                System.out.println("TestAnonymousInnerClass.test");
            }
        });
    }
}

interface A3 {
    void run();
}
