package com.itdoctorjake;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {

    public static void main(String[] args) {
        test3();
    }

    public static void test1() {
        System.out.println("111");
        int a = 1/0;
        System.out.println("222");
    }

    public static void test2() {
        System.out.println("111");
        try {
            int a = 1/0;    // ctrl+alt+t快捷键，增加try,catch
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("222");
    }

    /**
     * RunTimeException 需要程序员做逻辑处理
     */
    public static void test3() {
        // ArithmeticException: by zero
        int a = 1;
        int b = 0;
//        System.out.println(a/b);
        if(b!=0) {
            System.out.println(a/b);
        }

        // 空指针异常: NullPointerException
        String str = null;
        if (str!=null) {
            System.out.println(str.charAt(2));
        }

        // 数字格式化异常
        String str2 = "234abc";
//        int c = Integer.parseInt(str);
//        System.out.println(c);

        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(str2);
        if (m.matches()) {
            System.out.println(str2);
        } else {
            System.out.println("数字格式不对");
        }

        // 数组下标越界异常
        int[] arrs = new int[5];
        int f = 5;
        if (f>=0 && f<arrs.length) System.out.println(arrs[f]);    // [0,length-1]

        // 类型转化异常
        Animal ani = new Dog();
//        Cat cat = (Cat) ani;
        if (ani instanceof Cat) {
            Cat cat = (Cat) ani;
        }
    }
}

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}
