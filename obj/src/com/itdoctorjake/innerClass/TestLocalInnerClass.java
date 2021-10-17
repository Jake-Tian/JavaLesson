package com.itdoctorjake.innerClass;

/**
 * 测试局部内部类
 */
public class TestLocalInnerClass {

    public void show() {
        System.out.println("Step1");

        // 局部内部类。作用域仅限于该方法
        class Inner3 {

            public void run() {
                System.out.println("Inner3.run");
            }
        }

        // 本方法中，直接使用局部内部类
        new Inner3().run();
    }

    public static void main(String[] args) {
        new TestLocalInnerClass().show();
    }
}
