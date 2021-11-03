package com.itdoctorjake;

import java.util.*;

/**
 * 测试泛型的基本用法
 */
public class GenericTest1 {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        List<String> list = new ArrayList<>();
        list.add("dddd");
        // list.add(2332);

        Generic1<Integer> g1 = new Generic1<>();
        g1.aa(22);

        Generic1<String> g2 = new Generic1<>();
        g2.aa("hello");
    }
}

class Generic1<T> {

    public T aa(T obj) {
        System.out.println(obj);
        return obj;
    }

    public <N> void bb(N obj) {
        System.out.println(obj);
    }
}

interface MyList<E> {
    int size();
    boolean isEmpty();
    void add(E e);
    E get(int index);
}

class MyArrayList<E> implements MyList<E> {


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(E e) {

    }

    @Override
    public E get(int index) {
        return null;
    }
}