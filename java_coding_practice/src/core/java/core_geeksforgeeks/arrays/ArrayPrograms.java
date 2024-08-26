package core.java.core_geeksforgeeks.arrays;

import java.util.Arrays;

public class ArrayPrograms {
    public static void main(String[] s) {
        int arr[] = {12, 3, 1, 67, 23};
        findMax(arr);
        print2DArray();
    }

    private static void print2DArray() {

    }

    private static void findMax(int arr[]) {
//        int max = arr[0];
//        for (int i = 1; i<arr.length; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
       // int max = Arrays.stream(arr).max().getAsInt();
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        StringBuilder sb = new StringBuilder();
        sb.append("The height number is: ").append(max);
        System.out.println(sb);
    }
}
