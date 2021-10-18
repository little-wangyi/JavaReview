package equals;
public class compare {
    public static void main(String[] args) {
        Person p1 = new Person("小王", 10, "男");
        Person p2 = new Person("小王", 10, "男");
        System.out.println(p1.equals(p2));
    }
}

class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        Person p = (Person) obj;
        if (p.name.equals(this.name)) {
            if (p.age == this.age) {
                if (p.gender.equals(this.gender)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
