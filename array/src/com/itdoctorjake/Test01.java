package com.itdoctorjake;

/**
 * 测试数组的定义和基本使用方式
 */
public class Test01 {
    public static void main(String[] args) {

        // 数组的定义
        int[] a = new int[5];
        int b[] = new int[3];
        // 静态初始化
        int[] c = {100, 200, 300, 400};

        // 默认初始化规则：数字0，布尔false，引用null
        System.out.println(a[0]);

        // 数组的初始化
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        // 动态初始化
        for (int i = 0; i<a.length; i++) {
            a[i] = 10 + 10*i;
        }

        // 遍历数组
        for (int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }

        // 通过for-each循环，遍历数组
        for (int temp : c) {
            System.out.println(temp);
        }
        for (int i = 0; i<c.length; i++) {
            int temp = c[i];
            System.out.println(temp);
        }
    }
}
