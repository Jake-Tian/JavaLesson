package com.itdoctorjake.innerClass;

public class TestInnerClass1 {

    public static void main(String[] args) {

        // 非静态内部类的对象必须寄存在一个外部类对象里
        // 先创建外部类的对象，然后使用外部类对象创建内部类对象
        Outer1.Inner1 inner1 = new Outer1().new Inner1();
        inner1.test1();
    }
}
