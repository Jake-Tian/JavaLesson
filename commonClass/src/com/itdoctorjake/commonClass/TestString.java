package com.itdoctorjake.commonClass;

import java.util.Arrays;

/**
 * 测试String类的基本用法
 */
public class TestString {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        // String 类的定义
        String s1 = "abc";                          // 凡是字符串常量，都会回到字符串的常量池中
        String s2 = new String ("abc");     // 建了一个新的字符串对象
        String s3 = "abc";
        String s4 = "ABC";

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));          // 字符串的值是否相等
        System.out.println(s1.equalsIgnoreCase(s4));
    }

    public static void test2() {
        String s1 = "0123456789, How are you? How old are you?";
        System.out.println(s1.charAt(4));   // 索引位置4的字符
        System.out.println(s1.length());

        // 字符串转化为数组
        char[] chars = s1.toCharArray();
        System.out.println(Arrays.toString(chars));
        String[] str = s1.split(",");  // 可以传入正则表达式
        System.out.println(Arrays.toString(str));

        // 判断是否包含子字符串
        System.out.println(s1.indexOf("are"));
        System.out.println(s1.lastIndexOf("are"));
        System.out.println(s1.contains("How"));
        System.out.println(s1.startsWith("0123"));
        System.out.println(s1.endsWith("you?"));
    }

    public static void test3() {
        String s1 = "0123456789, How are you?";
        String s2 = s1.replace(" ", "&");
        System.out.println(s1);
        System.out.println(s2);

        s2 = s1.substring(4);
        System.out.println(s2);
        s2 = s1.substring(4,10);    // [4,10)
        System.out.println(s2);

        s2 = s1.toLowerCase();
        System.out.println(s2);
        s2 = s1.toUpperCase();
        System.out.println(s2);

        // 去除首尾空格
        String s3 = " How are you ";
        s2 = s3.trim();
        System.out.println(s3);
        System.out.println(s2);
    }
}
