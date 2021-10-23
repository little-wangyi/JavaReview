package StringBuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
        //1.创建一个大小为16的char[] ，来存放字符内容
        StringBuffer s1 = new StringBuffer();
        //2.创建一个字符大小为100的char[]
        StringBuffer s2 = new StringBuffer(100);
        //3.通过给定一个String创建的StringBuffer，char[]大小就是str.length+16
        StringBuffer s3 = new StringBuffer("hello");
    }
}
