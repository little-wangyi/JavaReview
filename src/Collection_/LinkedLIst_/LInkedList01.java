package Collection_.LinkedLIst_;

public class LInkedList01 {
    public static void main(String[] args) {
        //模拟简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node laohan = new Node("老韩");

        jack.next = tom;
        tom.next = laohan;

        laohan.pre = tom;
        tom.pre = jack;

        Node first = jack;
        Node last = laohan;

        //向后遍历双向链表
        System.out.println("========向后遍历======");
        while (true) {
            if(first==null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        //向前遍历双向链表
        System.out.println("========向前遍历======");
        while(true){
            if(last==null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        Node ins = new Node("ins");
        ins.next = tom;
        ins.pre = jack;
        jack.next = ins;
        tom.pre = ins;

        //重新指定首尾指标
        first = jack;
        last = laohan;

        System.out.println("========向后遍历======");
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }

}

class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}