package Collection_.LinkedLIst_;

import java.util.LinkedList;

public class LinkedList_curd {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //void linkLast(E e) {
        //除了第一次插入的元素是null以外，后续都是上一个元素
        //        final Node<E> l = last;
        //每次插入前生成一个Node
        //        final Node<E> newNode = new Node<>(l, e, null);
        //        last = newNode;
        //如果是第一次插入
        //        if (l == null)
        //            first = newNode;
        //后续插入
        //        else
        //            l.next = newNode;
        //        size++;
        //        modCount++;
        //    }
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        System.out.println(linkedList);

        //set(index，value)
        linkedList.set(1,99);
        System.out.println(linkedList);
        //默认删除第一个
        linkedList.remove();
        System.out.println(linkedList);
        //获取
        System.out.println(linkedList.get(2));
    }
}
