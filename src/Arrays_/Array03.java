package Arrays_;

import java.util.Arrays;
import java.util.List;

public class Array03 {
    public static void main(String[] args) {
        Integer[] arr = {0,1,4,5,6,7};
        //1.copy
        //拷贝原数组的大小和值
        //若拷贝的数组的大小大于原数组，会添加相应数量的null
        Integer[] arr2 = Arrays.copyOf(arr,arr.length+2);

        System.out.println(Arrays.toString(arr2));

        //若拷贝数组所需个数为0，就创建一个空数组;
        //若拷贝数组个数为负数，则会抛出一个异常java.lang.NegativeArraySizeException
//        Integer[] arr3 = Arrays.copyOf(arr,-1);

        //2.equals
        boolean eq = Arrays.equals(arr, arr2);
        System.out.println(eq);

        //3.aslist
        List list = Arrays.asList(1, 2, 5, 2, 123, 3);
        System.out.println(list);
    }
}
