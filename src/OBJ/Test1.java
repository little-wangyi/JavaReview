package OBJ;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 10;
        p.name = "小名";
        B b = new B();
        b.changeAge(p);
        System.out.println(p.age);
        int[] arr = new int[]{1,2,3};
        b.changeArr(arr);
        System.out.println(Arrays.toString(arr));
        b.changeName(p);
        System.out.println(p.name);
        String name = "aaa";
        b.changeString(name);
        System.out.println(name);

    }
}

class  B{
   public void changeAge(Person p){
       p = null;
    }

    public void changeArr(int[] arr){
       arr[0] = 100;
    }
    public void changeName(Person p){
       p.name = "仇杀比";
    }
    public void changeString(String s){
       s = "埃斯比";
    }
}
