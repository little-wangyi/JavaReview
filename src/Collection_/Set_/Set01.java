package Collection_.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        //插入无序
        //而且插入会有bool返回值
        hashSet.add("1");
        hashSet.add("ads");
        hashSet.add("ddd");
        hashSet.add("ccc");
        hashSet.add("bbb");
        hashSet.add(null);
        System.out.println(hashSet.add(null));

        //但是输出是相同的
        System.out.println(hashSet);

        System.out.println("===========");
        //可用增强for或者iterator进行迭代
        for(Object obj:hashSet){
            System.out.println(obj);
        }

        System.out.println("===========");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //若要移除可用remove方法
        hashSet.remove("ddd");
        System.out.println(hashSet);
    }
}
