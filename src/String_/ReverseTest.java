package String_;

public class ReverseTest {
    public static void main(String[] args) {
        ReverseTest r = new ReverseTest();
        String s = r.Reverse2("abcdef", 0, 5);
        System.out.println(s);
    }

    public String Reverse(String str, int start, int end) {
        if (start < end && start >= 0 && start < end && end < str.length()) {
            char[] c = str.toCharArray();
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
            return new String(c);
        }
        return "输入有误";
    }

    //写法2
    public String Reverse2(String str, int start, int end) throws RuntimeException {
        if (!(str != null && start >= 0 && start < end && end < str.length())) {
            throw new RuntimeException("输入参数有误");
        }
        char[] c = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        return new String(c);
    }
}
