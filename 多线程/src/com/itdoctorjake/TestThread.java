package com.itdoctorjake;

/**
 * 创建自己的第一个线程类
 */
public class TestThread extends Thread{

    // 重写run()方法，run()是线程体

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+":"+i);   // getName()返回的是线程名称
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread();   // 创建线程对象
        t1.start();

        TestThread t2 = new TestThread();
        t2.start();
    }
}
