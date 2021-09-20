package com.itdoctorjake.inherit;

/**
 * 测试finial的基本用法
 */

public class TestFinal {

    public static void main(String[] args) {
        final int MAX_SPEED = 120;  // 常量，只能赋值一次
        // MAX_SPEED = 120
    }

    // final 修饰方法，则这个方法方法不能被子类重写
    // final 修饰类，则这个类不能被子类继承
}
