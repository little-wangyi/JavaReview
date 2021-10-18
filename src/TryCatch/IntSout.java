package TryCatch;

import java.text.ParseException;
import java.util.Scanner;

public class IntSout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String a = sc.next();
            try{
                int num = Integer.parseInt(a);
                System.out.println(num);
                break;
            }catch(NumberFormatException e){
                System.out.println("请重新输入");
            }
        }
    }

}
