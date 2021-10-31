package com.itdoctorjake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 测试List接口的常用接法
 */
public class ListTest {

    public static void main(String[] args) {

        test02();
    }

    // 测试isEmpty, add, remove, size, contains, toArrays等常见方法
    // 这些方法多位于Collection接口中
    public static void test01() {
        // 有序，可重复
        List list = new ArrayList();    // 泛型
        System.out.println(list.isEmpty());
        list.add("Jake");
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.add("Martin");
        list.add("Alice");

        System.out.println(list);
        System.out.println("list的大小："+list.size());
        System.out.println("是否包含指定元素："+list.contains("Jake"));

        list.remove("Alice");
        System.out.println(list);

        Object[] objs = list.toArray();
        System.out.println("转化成Object数组："+ Arrays.toString(objs));

        list.clear();
        System.out.println(list);
    }

    // 测试和索引相关的方法
    public static void test02() {

        // List储存的是：有序、可重复
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        list.add(2, "jake");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2,'c');
        System.out.println(list);

        System.out.println(list.get(1));

        list.add("B");
        System.out.println(list);

        System.out.println(list.indexOf("B"));         // 从左到右找到第一个
        System.out.println(list.lastIndexOf("B"));  // 从右到左找第一个
    }

    // 测试两个容器之间的元素处理
    public static void test03() {
        // List list = new ArrayList();
        List list = new LinkedList();
        list.add("jake");
        list.add("Jake");
        list.add("JAKE");

        List list2 = new ArrayList();
        list2.add("jake");
        list2.add("alice");
        list2.add("bob");

        System.out.println(list.containsAll(list2));

        System.out.println(list);
        list.addAll(list2);
        System.out.println(list);

//        list.removeAll(list2);  //  删除掉list2和list中存在的元素
//        System.out.println(list);

        System.out.println("list: "+list);
        System.out.println("list2: "+list2);
        list.retainAll(list2);  // 取交集
        System.out.println(list);
    }
}
