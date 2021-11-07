package Generic;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        //1.泛型的类型只能是引用类型
        ArrayList<Integer> integers = new ArrayList<>();
//        ArrayList<int> ints = new ArrayList<int>(); //false

        //2.泛型在指定了具体的引用类型之后，可以向内部添加该引用类型的子类，或该类型
        P<A> ap = new P<A>(new A());
        P<A> ap1 = new P<>(new B());

        //3.泛型的使用类型
        P<Integer> integerP1 = new P<Integer>(1);
        P<Integer> integerP = new P<>(1);//常用

        //4.如果没有写，默认是Object
        ArrayList arrayList = new ArrayList();

    }
}

class A {
}

class B extends A{
}

class P<T> {
    T s;

    public P(T s) {
        this.s = s;
    }

    public void f() {
        System.out.println(s.getClass());
    }
}
