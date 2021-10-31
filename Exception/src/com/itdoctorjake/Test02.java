package com.itdoctorjake;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        // test1();
        /*
        try {
            test2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
         */
        // test3();
        System.out.println(test4());
    }

    // 测试try-catch-finally
    public static void test1() {
        FileReader reader = null;
        try {
            reader = new FileReader("c:/a.txt");
            char c1 = (char) reader.read();
            char c2 = (char) reader.read();
            System.out.println("文件的内容"+c1+c2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 测试throws, 声明式抛出异常
    public static void test2() throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2049-10-1";
        Date d = df.parse(str);
        System.out.println(d);
    }

    /**
     * "try-with-resource": 可以自动关闭实现了AutoClosable接口的类
     * try-catch-finally -> try-catch
     * 其实是一种语法糖，编译器帮我们做了处理，转化成了：try-catch-finally
     */
    public static void test3() {
        try(FileReader reader = new FileReader("c:/a.txt")) {
            char c1 = (char) reader.read();
            char c2 = (char) reader.read();
            System.out.println("文件的内容"+c1+c2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 任何执行try中的return语句之前，那会先执行finally语句（如果finally语句存在）
     * 如果finally语句中也有return，则直接return
     * @return
     */
    public static int test4() {
        int a = 10;
        System.out.println("step1");
        try {
            System.out.println("step2");
            a = 20;
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            a = 40;
            System.out.println("step3");
            return a;
        }
    }
}
