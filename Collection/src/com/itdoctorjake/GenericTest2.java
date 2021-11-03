package com.itdoctorjake;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符 ? 和上下限定
 */
public class GenericTest2 {

    // Dog和他的子类
    public static void test01(List<? extends Dog> list) {
        System.out.println(list);
    }

    public static void test02(List<? super Dog> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Animal> list1 = new ArrayList<>();
        List<Dog> list2 = new ArrayList<>();
        List<Taidi> list3 = new ArrayList<>();

        // test01(list1);
        test01(list2);
        test01(list3);

        test02(list1);
        test02(list2);
        // test02(list3);
    }
}

class Animal {}

class Dog extends Animal {}

class Taidi extends Dog {}
