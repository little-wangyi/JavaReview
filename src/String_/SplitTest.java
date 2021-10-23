package String_;

import java.util.Arrays;
import java.util.Locale;

public class SplitTest {
    public static void main(String[] args) {
        System.out.println(upReverse("Han shun Ping"));
    }

    public static String upReverse(String str) {
        String[] strs = str.split(" ");

        String temp = strs[0];
        strs[0] = strs[2];
        strs[2] = temp;
        char[] chars = strs[1].toCharArray();
        char c = strs[1].toUpperCase(Locale.ROOT).charAt(0);
        String s = String.format("%s,%s .%s", strs[0], strs[2], strs[1]);
        return s;
    }
}
