package com.itdoctorjake;

import java.util.Scanner;

/**
 * 测试通过百度/Google搜索解决问题
 */
public class Test04 {

    public static void main(String[] args) {

        String str = null;
        if (str != null) {
            System.out.println(str.substring(0));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入您的姓名：");
        String name = scanner.nextLine();

        System.out.println("===============");
        System.out.println("姓名："+name+",年龄："+age);

        // Scanner nextInt nextLine 跳过 没有执行
    }
}
