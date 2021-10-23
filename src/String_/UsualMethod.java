package String_;

public class UsualMethod {
    public static void main(String[] args) {
        //1.equals
        String a = "abv";
        String b = "Abv";
        System.out.println(a.equals(b));
        //2.equalsIgnoreCase
        System.out.println(a.equalsIgnoreCase(b));
        //3.length
        System.out.println(a.length());
        //4.indexof
        System.out.println(a.indexOf("b"));
        //5.lastindexof
        System.out.println(a.lastIndexOf("b"));
        //6.substring
        String name = "hey,张三";
        System.out.println(name.substring(2));//截取从2开始后的所有内容
        System.out.println(name.substring(0, 4));//从0开始，截取到5-1的位置
        //7.touppercase
        String low = "hello";
        System.out.println(low.toUpperCase());
        //8,tolowercase
        String high = "HELLO";
        System.out.println(high.toLowerCase());
        //9.concat
        String c1 = "小 大 小小";
        System.out.println(c1.concat("大大").concat("小小"));
        //10.replace
        c1 = c1.replace("小小", "大大"); //repalce不改变与原来的值，除非返回值赋给原变量
        System.out.println(c1);
        //11.split
        String poem = "转义测试\\fuck\\you";
        String[] split;
        split = poem.split("\\\\");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //12.toCharArray
        String arr = "hello world";
        char[] arrs = arr.toCharArray();
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
        //13.compareto
        String f1 = "jac";
        String f2 = "jac";
        String f3 = "bac";
        String f4 = "jack";
        System.out.println(f1.compareTo(f2));//情况1：如果长度，字符都相同，则返回0
        System.out.println(f2.compareTo(f3));//情况2：如果长度或字符不相同，在比较时区分大小
        //返回if(c1!=c2){
        //return;
        //}
        System.out.println(f1.compareTo(f4));//情况3:如果前面的字符相同，就返回str1.len-str2.len
        //14.format
        String name2 = "wangyi";
        int age = 18;
        double scores = 749.99;
        char gender = '男';
        String info = String.format("我的名字是%s,年仅%d,成绩是%.2f,性别%c", name2, age, scores, gender);
        System.out.println("info=" + info);
    }
}
