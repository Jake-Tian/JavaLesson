package com.itdoctorjake;

import java.util.Arrays;

/**
 * 测试二分法查找元素
 */
public class Test08 {

    public static void main(String[] args) {
        int[] arr = {30,20,10,50,90,80,100,7,9,12,8,72};
        int searchWord = 20;    // 查找的数字



        System.out.println(searchWord+"索引位置是："+binarySearch(arr,searchWord));
    }

    /**
     * 二分法查找
     * @param array 目标数组
     * @param searchWord 所要查找的值
     * @return 如果查找到，则返回这个值在数组中的索引；如果未找到，则返回-1
     */
    public static int binarySearch(int[] array, int searchWord) {
        int low = 0;
        int high = array.length-1;

        // 二分法查找的数组，必须先排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        while(low<=high) {
            int middle = (low+high)/2;

            if (searchWord == array[middle]) {
                return middle;  // 查询到这个值，返回对应的索引位置
            } else if (searchWord > array[middle]) {
                low = middle +1;
            } else {
                high = middle -1;
            }
        }

        return -1;  // 上面循环完毕，说明未找到，返回-1
    }
}
