package Homework;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 测试二分法查找元素
 */
public class Exercise37 {

    public static void main(String[] args) {
        int[] arr = {30,20,50,10,80,9,7,12,100,40,72};
        int searchWord = 72;
    }


    /**
     * 二分法查找
     * @param array 目标数据
     * @param value 所要返回的值
     * @return 如果查找到，则返回这个值在数组中的索引；如果未找到，则返回-1
     */
    public static int binarySearch(int[] array, int value) {
        // 二分法查找的数组，必须先做排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int low = 0;
        int high = array.length-1;

        while (low <= high) {
            int middle = (low+high) / 2;

            if (value == array[middle]) return middle;  // 查询到这个值，返回对应的索引位置
            else if (value > array[middle]) low = middle + 1;
            else high = middle-1;
        }

        return -1;  // 上面循环完毕，说明未找到，返回-1
    }
}
