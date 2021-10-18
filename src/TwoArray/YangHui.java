package TwoArray;

public class YangHui {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                    int a[] = new int[]{1,2};
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        for (int v = 0; v < arr.length; v++) {
            for (int v2 = 0; v2 < arr[v].length;v2++){
                System.out.print(arr[v][v2]+"\t");
            }
            System.out.println();
        }
    }
}
