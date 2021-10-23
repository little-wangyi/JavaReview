package BigNumbers_;

import java.math.BigDecimal;
import java.math.BigInteger;

public class bigNumbers {
    public static void main(String[] args) {
        //对于基本变量存储不到的长度可以用BigInteger进行存储计算
        //long l = 1235415123321222222222;

        BigInteger bigInteger = new BigInteger("1235415123321222222222");
        BigInteger bigInteger1 = new BigInteger("12");
        System.out.println(bigInteger.add(bigInteger1));
        System.out.println(bigInteger.divide(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1));
        System.out.println(bigInteger.subtract(bigInteger1));

        //浮点数高精度
        BigDecimal bigDecimal = new BigDecimal("12355778.212");
        BigDecimal bigDecimal1 = new BigDecimal("2");
        System.out.println(bigDecimal.add(bigDecimal1));
        //可能会抛出Arith的异常，因为出现了无限循环的小数
        //可以通过BigDecimal.ROUND_CEILING指定除后的小数位次同分子数量
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
    }
}
