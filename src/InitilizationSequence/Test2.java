package InitilizationSequence;

public class Test2 {
    //初始化加载顺序
    //static > 常 > 构造器
    //代码块和普通代码看哪边先执行
    private String A = "AAA";

    {
        String B = "BBB";
        System.out.println(A);
        System.out.println(B);
    }


    public static void main(String[] args) {
        Test2 t =new Test2();
    }
}
