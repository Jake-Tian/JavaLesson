package com.itdoctorjake.innerClass;

/**
 * 测试调用静态内部类
 */
public class TestStaticInnerClass {

    public static void main(String[] args) {

        // 通过new 外部类名、内部类名()来创建静态内部类的对象
        Outer2.Inner2 inner2 = new Outer2.Inner2();
        inner2.test();
    }
}
