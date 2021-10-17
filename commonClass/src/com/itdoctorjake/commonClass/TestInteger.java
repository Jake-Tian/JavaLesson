package com.itdoctorjake.commonClass;

/**
 * 测试包装类的用法，以Integer为主进行测试，其他包装类的用法类似
 */
public class TestInteger {

    public static void main(String[] args) {
        testInteger();
        testAutoBox();
        testCache();
    }

    /**
     * Integer的基本用法
     */
    public static void testInteger() {
        // 基本数据类型转化为Integer对象
        Integer int1 = Integer.valueOf(100);

        // 包装类对象转成基本数据类型
        int int2 = int1.intValue();
        long long1 = int1.longValue();

        // 字符串转成Integer对象
        Integer int3 = Integer.parseInt("325");
        System.out.println(int3);
        System.out.println(int3.toString());

        System.out.println("int能表示的最大整数："+Integer.MAX_VALUE);
    }

    public static void testAutoBox() {
        Integer a = 100;        // 自动装箱。编译器添加：Integer a = Integer.valueOf(100)
        int b = a;              // 自动拆箱。编译器添加：int b = a.intValue()

        // 空指针异常
        Integer c = null;
        // int d = c;              // 自动拆箱。编译器添加：int d = c.intValue()
    }

    public static void testCache() {
        // 整型、char类型所对应的包装类。在自动装箱时，对于-128到127之间的值会进行缓存的处理，为了提高效率
        Integer a = Integer.valueOf(100);
        Integer b = 100;
        System.out.println(a==b);   // 是同一个对象

        Integer c = 300;
        Integer d = 300;
        System.out.println(c==d);   // 不是同一个对象
    }
}
