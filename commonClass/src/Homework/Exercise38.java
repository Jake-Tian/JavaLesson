package Homework;

import java.util.Arrays;

/**
 * 测试String类的基本用法
 */
public class Exercise38 {
    public static void main(String[] args) {

    }

    public static void test1() {
        // String类的定义
        String s1 = "abc";  // 凡是字符常量，都会放到字符串的常量池中
        String s2 = new String ("abc");     // 建了一个新的字符串对象
        String s3 = "abc";
        String s4 = "ABC";

        // 比较字符串
        System.out.println(s1==s2);     // false
        System.out.println(s1==s3);     // true
        System.out.println(s1.equals(s2));  // 字符串的值是否相等
        System.out.println(s1.equalsIgnoreCase(s4));    // 忽略大小写
    }

    public static void test2() {
        String s1 = "0123456789, How are you? How old are you?";
        System.out.println(s1.charAt(4));   // 索引位置4的字符
        System.out.println(s1.length());

        // 字符串转化成数组
        char[] chars = s1.toCharArray();
        System.out.println(Arrays.toString(chars));
        String[] strs = s1.split(",");  // 可以传入正则表达式
        System.out.println(Arrays.toString(strs));

        // 判断是否包含子字符串
        System.out.println(s1.indexOf("are"));
        System.out.println(s1.lastIndexOf("are"));
        System.out.println(s1.contains("How"));
        System.out.println(s1.startsWith("01234"));
        System.out.println(s1.endsWith("you?"));
    }

    public static void test3() {
        String s1 = "0123456789, How are you?";

        String s2 = s1.replace(" ", "&");
        System.out.println(s1);
        System.out.println(s2);

        s2 = s1.substring(4);
        System.out.println(s2);
        s2 = s1.substring(4,10);
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
