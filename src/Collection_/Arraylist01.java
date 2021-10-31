package Collection_;

import java.util.ArrayList;
import java.util.Collection;

public class Arraylist01 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        //add
        //add内部添加的是object
        list.add("jack");
        list.add(10);
        list.add(true);
        list.add("卑微小e");
        System.out.println("list:" + list);
        //remove
        //两种用法,一种是指定元素值
        //一种是指定数组元素
        list.remove("jack");
        list.remove(0);
        System.out.println("list:" + list);
        //contains
        System.out.println(list.contains("卑微小e"));
        //size
        System.out.println(list.size());
        //clear 清空列表
        list.clear();
        System.out.println(list);
        //isEmpty
        System.out.println(list.isEmpty());
        //addAll
        list.add("憨c");
        list.add("ddc");
        ArrayList list2 = new ArrayList();
        list2.add("憨憨");
        list2.add("ddd");
        list.addAll(list2);
        System.out.println("list:" + list);
        //containsAll
        System.out.println("containsAll:" + list.containsAll(list2));
        //removeAll
        list.removeAll(list2);
        System.out.println("list:"+list);
    }
}