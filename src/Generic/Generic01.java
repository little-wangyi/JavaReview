package Generic;

public class Generic01 {
    public static void main(String[] args) {
        Person<String> e = new Person<>("卑微小e");
        System.out.println(e.f());
        e.show();
    }
}
class Person<E>{
    E s;

    public Person(E s) {
        this.s = s;
    }
    public E f(){
        return this.s;
    }
    public void show(){
        System.out.println(s.getClass());
    }
}
