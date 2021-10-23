package Arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class Array01 {
    public static void main(String[] args) {
        int[] a = {1,4,2};
        //显示数组
        System.out.println(Arrays.toString(a));
        //排序
        //sort是直接引用类型的，所以会直接影响实参数
        Integer[] integers = {1,2,5,213,3,21,4};
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        //自定义正序/倒序
        //内部使用了二叉树排序
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                //i1-i2正序
                //i2-i1倒序
                return i1-i2;

            }
        });
        System.out.println(Arrays.toString(integers));
    }
}
