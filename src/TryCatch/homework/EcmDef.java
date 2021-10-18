package TryCatch.homework;

import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            String n1 = sc.next();
            String n2 = sc.next();
            if(n1.equals("a")|n2.equals("a")){
                throw new ArrayException("aaa");
            }
            int n3 = Integer.parseInt(n1);
            int n4 = Integer.parseInt(n2);

            int res = EcmDef.cal(n3, n4);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (ArrayException e){
            System.out.println(e.getMessage());
        }
    }

    static int cal(int n1, int n2) {
            int res = n1 / n2;
            return res;
    }
}

class ArrayException extends RuntimeException{
    public ArrayException(String message) {
        super(message);
    }
}
