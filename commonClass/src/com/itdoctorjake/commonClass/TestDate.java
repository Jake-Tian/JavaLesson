package com.itdoctorjake.commonClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试时间相关的类
 */
public class TestDate {

    public static void main(String[] args) throws ParseException {
        test1();
        test2();    // try catch
        test3();
    }


    /**
     * 测试Date类
     */
    public static void test1() {
        long nowNum = System.currentTimeMillis();
        System.out.println(nowNum);

        Date d1 = new Date(100000000);
        System.out.println(d1);
        System.out.println(d1.getTime());

        Date d2 = new Date(1000L*3600*24*365*150);   // 距离1970年150年后的日期，忽略闰月
        System.out.println(d2);

        Date d3 = new Date();
        d3.getDate();   //方法被废弃，可以用，但是不建议用
    }

    /**
     * 测试DateFormat类的使用，时间和字符串之间的转换
     */
    public static void test2() throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d2 = new Date(1000L*3600*24*365*150);
        String str2 = df.format(d2);
        System.out.println(str2);

        String str3 = "2049-10-1 10:10:20";
        Date d3 = df.parse(str3);
        System.out.println(d3.getTime());

        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日");

        // 应用格式化字符可以方便的做一些其他的事，获取当前时间是当前时间的第几天
        DateFormat df3 = new SimpleDateFormat("D");
        Date date3 = new Date();
        System.out.println(df3.format(date3));
    }

    public static void test3() {
        // 月份：0-11. 0：1月 1：2月 ...
        // 星期：1-7. 1：周日 2：周一 ... 7: 周六
        Calendar calendar = new GregorianCalendar(2999,9,10,11,25,40);
        Calendar calendar2 = new GregorianCalendar(2999,Calendar.OCTOBER,10,11,25,40);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(year);
        System.out.println(month);

        calendar.set(Calendar.YEAR,2049);
        System.out.println(calendar.get(Calendar.YEAR));

        System.out.println(calendar.getTime().getTime());   // 返回对应的Date对象
        System.out.println(calendar.getTimeInMillis());     // 范围对应的毫秒数

        // 日期的计算
        calendar.add(Calendar.DATE, 10000);     // 往后10000天
        System.out.println(calendar.getTime());
        calendar.add(Calendar.YEAR,-30);        // 往前30年
        System.out.println(calendar.getTime());
    }
}
