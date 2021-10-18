package Constructor;

public class constructor {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.age);
        Person2 p2 = new Person2(18,"ww");
        System.out.println(p2.pName+":"+p2.pAge);
    }
}
class Person{
    int age ;
    public Person(){
        age = 18;
    }
}

class Person2{
    String pName;
    int pAge;
    public Person2(int age,String name){
        pName = name;
        pAge = age;
    }
}
