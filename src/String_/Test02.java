package String_;

public class Test02 {
    public static void main(String[] args) {
        Test02 ex = new Test02();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str +"and");
        System.out.println(ex.ch);
    }

    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }
}
