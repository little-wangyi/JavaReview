package TwoArray;

public class Mouse {
    public static void main(String[] args) {
        int[][] arr = new int[8][7];
        for (int i = 0; i < arr[0].length; i++) {
            arr[0][i] = 1;
            arr[7][i] = 1;
            arr[2][i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][6] = 1;
        }
        arr[3][1] = 1;
        arr[3][2] = 1;
//        arr[2][1] = 1;
//        arr[2][2] = 1;
//        arr[1][2] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        Mouse m = new Mouse();
        m.findWay(arr, 1, 1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    //0表示可以走，但是还没走过，1表示障碍，2表示可以走，3表示没路走
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                //说明这格子还没走过
                //将其变为可走
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) { //向下走
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            }
            else{
                return false;
            }
        }
    }

}
