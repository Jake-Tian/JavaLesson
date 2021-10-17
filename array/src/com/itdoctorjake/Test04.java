package com.itdoctorjake;

import java.util.Arrays;

/**
 * 测试工具类：java.util.Arrays
 */
public class Test04 {
    public static void main(String[] args) {
        int[] c = {10,32,8,4,100,40};
        System.out.println(c);
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.binarySearch(c,100));

        int[] d = new int[10];
        Arrays.fill(d,100);
        System.out.println(Arrays.toString(d));
    }


}
