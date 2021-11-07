package Collection_.HashSet_;

import java.util.HashSet;

public class Hashset01 {
    public static void main(String[] args) {
        //hashSet的底层实现是hashMap
        //但是实现方式是数组+单向链表+红黑树
        //大体上是创建一个16位大小的数组，每个位置存放一个64位长度的单项链表，若是超过了这个大小会转换成一个树来存储
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
    }

}
