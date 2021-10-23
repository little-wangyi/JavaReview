package StringBuffer_;

public class StringBuffer03 {
    public static void main(String[] args) {
        //增
        StringBuffer s = new StringBuffer("hello");
        s.append(",").append("张三丰").append("赵敏").append(100).append(true);
        System.out.println(s);
        //删
        //删除[5,6)的字符
        s.delete(5,6);
        System.out.println(s);
        //改
        //修改[8,10)处的值
        s.replace(8,10,"周芷若");
        System.out.println(s);
        //查
        //获取该字符串第一次出现的位置,若没有就返回-1
        int index = s.indexOf("张三丰");
        System.out.println(index);
        //插
        //在第8位前开始插入后续字符串
        s.insert(8,"赵敏");
        System.out.println(s);
        System.out.println(s.length());
    }
}
