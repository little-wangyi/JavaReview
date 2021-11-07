package Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Generic03 {
    public static void main(String[] args) {
        //4.泛型类的类型是在创建对象时确定的
        Gt<String, Integer, Integer> stringIntegerIntegerGt = new Gt<String, Integer, Integer>("a",1,2);
    }
}
class Gt<R,M,E>{
    //1.普通成员也可使用泛型，(属性，方法)
    R r;
    M m;
    E e;
    //2.不能为泛型数组进行初始化（编译器不知道开辟多大空间
    R[] rs;

    public Gt(R r, M m, E e) {
        this.r = r;
        this.m = m;
        this.e = e;
    }
    //3.不能在静态方法中使用类的泛型(因为类还没加载完，不能够确定你使用的方法中参数的类型）
    /*public static f(R r){
        System.out.println(r.getClass());
    }*/
    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Gt{" +
                "r=" + r +
                ", m=" + m +
                ", e=" + e +
                ", rs=" + Arrays.toString(rs) +
                '}';
    }
}
