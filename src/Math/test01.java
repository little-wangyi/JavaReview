package Math;

import java.util.concurrent.atomic.DoubleAccumulator;

public class test01 {
    public static void main(String[] args) {
        int abs = Math.abs(-1);
        System.out.println(abs);
        //开方
        double pow = Math.pow(2, 4);
        System.out.println(pow);
        //向上取整
        double ceil = Math.ceil(2.9);
        System.out.println(ceil);
        //向下取整
        double floor = Math.floor(2.1);
        System.out.println(floor);
        //四舍五入
        long round = Math.round(2.6);
        System.out.println(round);
        //随机数
        //创建一个2<=x<=7的随机数
        //以2为a，7为b 则有 a+Math.random()*(b-a+1)
        for (int i = 0; i < 10; i++) {
            double random = 2 + Math.random() * 6;
            System.out.println("rd" + (int) random);
        }
        //最大值
        int max = Math.max(1, 2);
        System.out.println(max);


    }
}
