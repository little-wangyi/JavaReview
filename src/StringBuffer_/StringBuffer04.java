package StringBuffer_;

public class StringBuffer04 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        //底层调用AbstractStringBuilder 的 appendNull
        //会将null转为'n','u','l','l'的字符进行存储
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);
        //空指针报错
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }
}
