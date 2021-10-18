package Recursion;

public class test1 {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        } else {
            System.out.println("n:" + n);
        }
    }

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }

    }

    public int fb(int n) {
        if (n == 1 || n == 2) {
            return  1;
        }else{
            return fb(n-1) + fb(n-2);
        }
    }

    public int peach(int day) {
        if(day == 10){
            return 1;
        }else if(day>=1 && day <= 9){
            return (peach(day+1)+1) *2;
        }else{
            return -1;
        }

    }
    public static void main(String[] args) {
        test1 t = new test1();
//        t.test(10);
//        int res = t.factorial(5);
//        System.out.println("阶乘的值：" + res);
        System.out.println(t.fb(7));
        int peaches = t.peach(1);
        System.out.println(peaches);
    }
}
