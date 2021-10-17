package Homework;

public class Exercise39 {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        String s = "";
        StringBuilder sb = new StringBuilder();
        StringBuffer sb2 = new StringBuffer();

        sb.append("a");
        sb.append("b");
        sb.append("c").append("d").append("e");
        System.out.println(sb);
    }

    public static void test2() {
        // 使用String进行的字符串的拼接
        String str = "";
        long num1 = Runtime.getRuntime().freeMemory();  // 获取JVM剩余的内存空间，单位是字节
        long time1 = System.currentTimeMillis();        // 获取当前时间，单位是毫秒
        for (int i = 0; i < 5000; i++) {
            str += i;       // 相当于产生5000个对象
        }

        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String占用内存："+(num1-num2));
        System.out.println("String占用时间："+(time2-time1));

        System.out.println("=====可变字符序列=====");
        StringBuilder sb = new StringBuilder();
        long num3 = Runtime.getRuntime().freeMemory();  // 获取JVM剩余的内存空间，单位是字节
        long time3 = System.currentTimeMillis();        // 获取当前时间，单位是毫秒
        for (int i = 0; i < 5000; i++) {
            sb.append(i);       // 相当于产生5000个对象
        }

        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("String占用内存："+(num3-num4));
        System.out.println("String占用时间："+(time4-time3));
    }
}
