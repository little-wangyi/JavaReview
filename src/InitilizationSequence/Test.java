package InitilizationSequence;

public class Test {
    Sample s1 = new Sample("非静态初始化");//3
    static Sample s2 = new Sample("静态初始化");//1

    static {
        System.out.println("代码执行"); //2
        if (s2 == null) {
            System.out.println("sam = null");
        }
        System.out.println(s2.hashCode());
    }

    Test() {
        System.out.println("函数的默认构造器被调用");//4
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("无参");
    }
}