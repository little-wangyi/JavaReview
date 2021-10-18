package array;

import java.util.Arrays;
import java.util.Scanner;

public class shuzu {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(Arrays.stream(a).average());
        System.out.println(a.length);

        System.out.println("声明数组大小");
        Scanner sc = new Scanner(System.in);
        double[] b = new double[sc.nextInt()];
        for (int i = 0; i < b.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素的值");
            b[i] = sc.nextDouble();
        }
        System.out.println("遍历数组");
        for(int j = 0 ; j < b.length ;j++){
            System.out.println(b[j]);
        }
    }
}
