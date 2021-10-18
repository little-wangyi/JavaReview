package TryCatch;

import javax.print.DocFlavor;

public class test1 {
    public static void main(String[] args) {
        System.out.println(method());
    }
    public static int method() {
        int i = 1;
        try {
            i++;
            String[] names = new String[3];
            if (names[0].equals("aaa")) {
                return 1;
            }
            return 1;
        } catch (NullPointerException e) {
            return ++i;
        } finally {
            ++i;
            System.out.println("i=:"+i);
        }
    }
}


