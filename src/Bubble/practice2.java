package Bubble;

import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {
        int[] arr = new int[]{12,45,1,54,2,89,31,53};
        for (int i = arr.length-1; i>0;i--){
            for(int j = 1; j<i+1;j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
