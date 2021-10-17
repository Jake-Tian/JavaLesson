package Homework;


public class Exercise40 {

    public static void main(String[] args) {
        testInteger();
    }

    /**
     * Integer的基本用法
     */
    public static void testInteger() {
        // 基本数据类型转化成Integer对象
        Integer int1 = Integer.valueOf(100);

        // 包装类对象转成基本数据类型
        int int2 = int1.intValue();
        long long1 = int1.longValue();

        // 字符串转为Integer对象
        Integer int3 = Integer.parseInt("325");
        System.out.println(int3);
        System.out.println(int3.toString());

        System.out.println("int能表示的最大整数："+Integer.MAX_VALUE);
    }

    public static void testAutoBox() {

        Integer a = 100;    // 自动装箱。编译器添加：Integer a = Integer.valueOf(100);

        int b = a;          // 自动拆箱。编译器添加：int b = a.intValue();

        // 空指针异常
        Integer c = null;
        // int d = c        // 自动拆箱。编译器添加：int d = c.intValue();
    }

}
