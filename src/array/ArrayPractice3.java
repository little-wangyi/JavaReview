package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要输入的数组长度");
        int lon = sc.nextInt();
        int[] arr = new int[lon];
        for (int i = 0; i < lon; i++) {
            System.out.println("请输入第" + i + "个值");
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.println("请输入你所要插入的值");
        int ins = sc.nextInt();
        int[] tmp = new int[arr.length + 1];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (ins <= arr[i]) {
                index = i - 1;
                break;
            }
        }
        if(index == -1){
            index =0;
        }
        for (int i = 0,j = 0; i < tmp.length; i++) {
            if (i == index) {
                tmp[i] = ins;
                continue;
            }
            tmp[i] = arr[j];
            j++;
        }
        System.out.println(Arrays.toString(tmp));
    }
}
