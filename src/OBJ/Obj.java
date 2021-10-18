package OBJ;

public class Obj {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "小明";
        p1.age = 10;
        Person p2 = p1;
        p2.age = 200;
        p2 = null;
        System.out.println(p1.age);
        p1.speak();
//        System.out.println(p2.age);
        System.out.println(p1.Cal01());
        System.out.println(p1.Cal02(1000));
    }
}

class Person{
    String name;
    int age;
    public void speak(){
        System.out.println("我是一个好人");
    }
    public int Cal01(){
        int sum = 0;
        for(int i = 1; i<=1000; i++){
           sum += i;
        }
        return sum;
    }
    public int Cal02(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}