package core.java;

import java.util.Arrays;

public class AddZerosArrayEnd {
    public static void main(String[] s) {
        int[] arr = {0, 0, 0, 1, 2, 0, 3};
        int tempArr[] = new int[arr.length];
        int count = 0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] != 0) {
                tempArr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            tempArr[count++] = 0;
        }
        arr = tempArr;
        Arrays.stream(arr).forEach(i-> System.out.println(i));
    }
}
