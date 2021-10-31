package Collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator01 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("a");
        col.add("b");
        col.add("c");
        col.add("d");

        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //迭代完成后游标在最后一个元素处，若再用next会报错
        //java.util.NoSuchElementException
        //System.out.println(iterator.next());

        System.out.println("=======");

        //若要再次迭代
        Iterator iterator1 = col.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }

        System.out.println("=======");
        //增强for迭代
        for (Object obj : col) {
            System.out.println(obj);
        }

    }
}
