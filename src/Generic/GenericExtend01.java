package Generic;

import OBJ.Obj;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericExtend01 {
    public static void main(String[] args) {

        //泛型没有继承性
//        ArrayList<Object> list = new ArrayList<String>();

        ArrayList<AA> list1 = new ArrayList<>();
        ArrayList<BB> list2 = new ArrayList<>();
        ArrayList<CC> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();

        //<?>可以接受任意属性
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);
        //<? extends XX>可以接受任意XX类的子类（包括XX）

        printCollection2(list1);
        printCollection2(list2);
        printCollection2(list3);
//        printCollection2(list4);
//        printCollection2(list5);
        //<? super XX>可以接受XX的任意父类（包括XX）
        printCollection2(list1);
        printCollection2(list2);
        printCollection2(list3);
//        printCollection2(list4);
//        printCollection2(list5);

    }
    @Test
    public static void printCollection1(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void printCollection2(List<? extends AA> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void printCollection3(List<? super CC> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}


class AA {

}

class BB extends AA {

}

class CC extends BB {

}