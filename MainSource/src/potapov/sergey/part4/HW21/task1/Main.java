package potapov.sergey.part4.HW21.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        System.out.println(Arrays.deepToString(arr));
        toLeft(arr);

    }

    public static void toLeft(int[][] arr) {
        for (int i = 0; i < 2; i++){
                for (int j = 1; j < 10; j++) {
                    int tmp = arr[i][j];
                    arr[i][j] = arr[i][j - 1];
                    arr[i][j - 1] = tmp;
                }
        }
        arr[0][9] = 0;
        arr[1][9] = 0;
        System.out.println(Arrays.deepToString(arr));
    }
}
