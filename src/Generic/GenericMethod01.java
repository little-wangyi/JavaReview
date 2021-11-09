package Generic;

public class GenericMethod01 {
    public static void main(String[] args) {
        car car = new car();
        //在使用方法进行传入值的时候，会自动装箱来解析类型
        car.ride("宝马", 100);
        fish<String, Integer> fish = new fish<>();
        fish.eat("小鱼",100);
    }
}

class car {
    public void run() {

    }

    //泛型方法，在修饰符后面加入<x,x>
    //普通类和泛型类均可使用
    public <T, R> void ride(T t, R r) {
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }

}

//泛型方法和使用了泛型是两个概念
class fish<T, R> {
    //这样是使用了泛型类定义的泛型
    public void eat(T t) {

    }

    //这样是泛型方法使用了类定义的泛型类型
    public<X> void eat(T t,X x){
        System.out.println(t.getClass());
        System.out.println(x.getClass());
    }
}