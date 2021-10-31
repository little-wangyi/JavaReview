package Collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExercise {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Dog("g1","11"));
        c.add(new Dog("g2","12"));
        c.add(new Dog("g3","13"));
       Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.toString());
        }

        for (Object dog:c) {
            System.out.println(dog.toString());
        }
    }
}

class Dog{
    private String name;
    private String age;

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
