package potapov.sergey.part4.HW21.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 3, 53, 22, 4, 6, -1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseArr(arr)));

    }

    public static int[] reverseArr (int[] arr){
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
        }
        return arr;
    }
}
