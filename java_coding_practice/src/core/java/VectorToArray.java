package core.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorToArray {
    public static void main(String[] s) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println(vector);

        List<Integer> list = Collections.list(vector.elements());
        Object[] objArr = list.toArray();
        Integer[] arr = Arrays.copyOf(objArr, objArr.length, Integer[].class);
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println("================");
        for(int i = 0; i< arr.length; i++) {
            System.out.println(i + " = " + arr[i]);
        }
    }
}
