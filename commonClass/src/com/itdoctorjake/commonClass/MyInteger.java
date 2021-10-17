package com.itdoctorjake.commonClass;

/**
 * 自定义一个简单的包装类，仅用于学习和娱乐！
 */
public class MyInteger {
    private int value;
    private static MyInteger[] cache = new MyInteger[256];

    public static final int LOW = -128;
    public static final int HIGH = 127;

    // 静态初始化块：是在类被加载的时候，初始化类的属性
    static {

        for (int i = MyInteger.LOW; i<=HIGH; i++) {
            // -128, 0; -127, 1; -126, 2
            cache[i+(-LOW)] = new MyInteger(i);
        }
    }

    public static MyInteger valueOf(int i) {
        // 如果在-128到127之间，则返回数组中缓存的对象，否则创建新的对象
        if (i>=LOW && i<=HIGH) {
            return cache[i+(-LOW)];
        } else {
            return new MyInteger(i);
        }
    }

    public int intValue() {
        return value;
    }

    @Override
    public String toString() {
        return value+"";
    }

    public MyInteger (int i) {
        this.value = i;
    }

    public static void main(String[] args) {
        MyInteger a = MyInteger.valueOf(100);
        MyInteger b = MyInteger.valueOf(100);

        System.out.println(a==b);

        MyInteger c = MyInteger.valueOf(400);
        MyInteger d = MyInteger.valueOf(400);

        System.out.println(c==d);
    }
}
