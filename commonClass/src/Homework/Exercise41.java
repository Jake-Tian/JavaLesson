package Homework;

import java.util.Date;

public class Exercise41 {

    public static void test1() {
        long nowNum = System.currentTimeMillis();   // 返回当前的毫秒数
        System.out.println(nowNum);

        Date d1 = new Date();
        System.out.println(d1.getTime());
    }
}
