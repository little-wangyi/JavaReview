package array;

public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] a = {4, -1, 9, 10, 23};
        int biggest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (biggest < a[i]) {
                biggest = a[i];
            }
        }
        System.out.println(biggest);
        int[] arr = {1, 2, 3};
        int[] arr2 = arr;
        arr2[0] = 2;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
