package StringBuffer_;

public class StringBuffer02 {
    public static void main(String[] args) {
        //String -> StringBuffer
        //1.构造器
        //注意返回的才是StringBuffer对象，对String本身没什么影响
        StringBuffer a = new StringBuffer("aaa");
        //2.通过StringBuffer提供的append方法
        StringBuffer a2 = new StringBuffer();
        a2.append("hello this is a2");
//        System.out.println(a2);

        //StringBuffer -> String
        //1.通过StringBuffer提供的toString
        StringBuffer s1 = new StringBuffer("test");
        String s = s1.toString();
//        System.out.println(s1);
        //2.通过String构造器
        String s2 = new String(s1);
//        System.out.println(s2);
    }
}
