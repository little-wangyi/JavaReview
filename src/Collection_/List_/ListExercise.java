package Collection_.List_;

import java.util.*;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
//        List list = new LinkedList();
//        List vector = new Vector();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + i);
        }
        list.remove(7);
        list.add(1, "world");
        list.set(2, "弟弟");
        System.out.println("list:" + list);
        System.out.println(list.get(5));
        Iterator iterator = list.iterator();
        System.out.println("===========");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("==========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
