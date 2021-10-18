package array;

public class ArrayReserve {
    public static void main(String[] args) {
        //2分逆转
        int[] before = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < before.length / 2; i++) {
            int temp = before[i];
            before[i] = before[before.length - i - 1];
            before[before.length - i - 1] = temp;
        }

        for (int i = 0; i < before.length; i++) {
            System.out.print(before[i]+"\t");
        }
    }
}
