package StringBuffer_;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        StringBuffer price = new StringBuffer("123345.45");
        int index = price.indexOf(".");
//        System.out.println(index);
        if (Double.parseDouble(price.toString()) > 1000) {
            for (int i = index - 3; i > 0; i = i - 3) {
                price = price.insert(i, ",");
            }
        }
        System.out.println(price);
    }
}

