package com.itdoctorjake;

/**
 * 测试数组的拷贝
 */
public class Test03 {
    public static void main(String[] args) {
        String[] a = {"阿里","百度","腾讯","网易","搜狐"};
        String[] b = new String[6];

        System.arraycopy(a,1,b,0,2);
        for (String temp : b) {
            System.out.println(temp);
        }
    }
}
