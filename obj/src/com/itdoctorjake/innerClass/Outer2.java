package com.itdoctorjake.innerClass;

/**
 * 测试静态内部类
 */
public class Outer2 {
    private int a = 10;
    private static int b = 20;

    // 静态内部类
    static class Inner2 {

        public void test() {
            // System.out.println(a);   // 静态内部类不能访问外部类的普通属性/方法
            System.out.println(b);      // 静态内部类可以访问外部类的静态属性/方法
        }
    }
}
