package array;

public class ArrayPractice1 {
    public static void main(String[] args) {
        char[] a = new char[26];
        for (int i = 0; i < a.length; i++) {
            a[i] = (char)('A' + i);
        }
        for(int j = 0 ; j < a.length ; j++){
            System.out.print(a[j] + "\t");
        }
    }
}
