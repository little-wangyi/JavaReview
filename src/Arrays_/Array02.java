package Arrays_;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 4, 3, 32};
        //bubble(arr);
        System.out.println(Arrays.toString(arr));
        //二分查找
        //前提是数组有序
        int i = Arrays.binarySearch(arr, 1);
        System.out.println(i);
    }

    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //从小到大
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
