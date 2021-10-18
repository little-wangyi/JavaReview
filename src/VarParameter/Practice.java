package VarParameter;

public class Practice {
    public static void main(String[] args) {
        Practice p = new Practice();
        p.ShowScore("ww", 1, 3,43,3,12);
        p.test();
        System.out.println(p.a);
    }
    int a;

    public void test(){
        int a = 20 ;
        System.out.println(a);
    }
    public String ShowScore(String name, int... scores) {
        int res = 0;
        if (scores.length == 2 || scores.length == 3 || scores.length == 5) {
            for (int i = 0; i < scores.length; i++) {
                res += scores[i];
            }
            System.out.println(name + "的总分为：" + res);
            return "输出完成";
        }
        return "输入参数有误";
    }
}
