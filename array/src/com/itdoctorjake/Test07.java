package com.itdoctorjake;

import java.util.Arrays;

/**
 * 测试冒泡排序
 */
public class Test07 {

    public static void main(String[] args) {
        int[] values = {3,1,6,2,9,0,7,4,8,5};
        bubbleSort(values);

    }

    public static void bubbleSort (int[] values) {
        // int[] values = {3,1,6,2,9,0,7,4,8,5};

        System.out.println("排序前,数组："+ Arrays.toString(values));
        int temp;   // 用于交换的临时变量
        // 定义一个布尔类型变量，标记数组是否已达到有序状态
        boolean flag = true;
        for (int i = 0; i < values.length; i++) {

            for (int j = 0; j < values.length - i - 1; j++) {

                if (values[j] > values[j+1]) {
                    temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                    // 本趟发生了交换，表明该数组在本趟处于无序状态，需要继续排序。
                    flag = false;
                }
                System.out.println("第"+i+"趟，第"+j+"次："+Arrays.toString(values));
            }

            // 冒泡排序的优化
            if (flag) {
                System.out.println("结束排序！");
                break;
            } else {
                flag = true;
            }

            System.out.println("第"+i+"趟，完成时："+Arrays.toString(values));
        }
    }
}
