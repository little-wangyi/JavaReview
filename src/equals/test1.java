package equals;

public class test1 {
    public static void main(String[] args) {
        P p1 = new P();
        p1.name = "aaa";
        P p2 = new P();
        p2.name = "aaa";
        System.out.println(p1 == p2);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.equals(p2));

        String a1 = new String("asdf");
        String a2 = new String("asdf");
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);

    }
}

class P {
    String name;
}