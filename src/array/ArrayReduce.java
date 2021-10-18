package array;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("开始删减");
        String judge = sc.next();
        while (judge.equals("y")) {
            if(a.length == 0){
                break;
            }
            int[] newArr = new int[a.length-1];
            for (int i = 0; i<newArr.length ; i++){
                newArr[i] = a[i];
            }
            a = newArr;
            System.out.println("此时的值为：");
            for (int i= 0;i<a.length;i++){
                System.out.print(a[i]+"\t");

            }
            System.out.println("是否继续");
            judge = sc.next();
        }

    }
}
