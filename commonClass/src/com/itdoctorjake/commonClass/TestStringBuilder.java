package com.itdoctorjake.commonClass;

/**
 * 测试可变字符序列的用法
 */
public class TestStringBuilder {

    public static void main(String[] args) {
        // test1();
        test2();
    }

    public static void test1() {
        String s;
        StringBuilder sb = new StringBuilder();
        StringBuffer sb2 = new StringBuffer();

        sb.append("a");
        sb.append("b");
        sb.append("c").append("d").append("e");
        System.out.println(sb);

        sb2.append("jake");
        sb2.insert(0,"hello, ").insert(0,"'");
        System.out.println(sb2);

        sb2.delete(0,1);    // [0,1) 包头不包尾
        System.out.println(sb2);

        sb2.deleteCharAt(5);
        System.out.println(sb2);

        System.out.println(sb2.reverse());
    }

    public static void test2() {
        // 使用string进行字符串的转换
        String str = "";
        long num1 = Runtime.getRuntime().freeMemory();  // 获取JVM剩余的内存空间，单位是字节
        long time1 = System.currentTimeMillis();        // 获取当前时间，单位是毫秒
        for (int i = 0; i<5000; i++) {
            str += i;   // 相当于会产生5000个String对象
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String 占用内存："+(num1-num2));
        System.out.println("String 占用时间："+(time2-time1));

        System.out.println("===========使用可变字符序列，完成拼接===========");
        StringBuilder sb = new StringBuilder();
        long num3 = Runtime.getRuntime().freeMemory();  // 获取JVM剩余的内存空间，单位是字节
        long time3 = System.currentTimeMillis();        // 获取当前时间，单位是毫秒
        for (int i = 0; i<5000; i++) {
            sb.append(i);   // 相当于会产生5000个String对象
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("String 占用内存："+(num4-num3));
        System.out.println("String 占用时间："+(time4-time3));
    }
}
