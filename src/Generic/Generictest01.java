package Generic;

import java.util.*;

public class Generictest01 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student("小王", 20));
        students.add(new Student("小e", 18));
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next.getName() + ":" + next.getAge());
        }

        HashMap<String, Student> hm = new HashMap<>();
        hm.put("小王", new Student("小王", 20));
        hm.put("小e", new Student("小e", 20));
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next = iterator1.next();
            System.out.println(next.getKey()+next.getValue().getAge());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}