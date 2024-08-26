package core.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

//convert LinkedList to Array
public class LinkedListToArray {
    public static  void main(String s[]) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");

        System.out.println(linkedList);
        System.out.println("============================");
        Object[] objArray = linkedList.toArray();
        String[] arr = Arrays.copyOf(
                objArray,
                objArray.length,
                String[].class);
        // Print the String Array
        System.out.println("Array: "
                + Arrays.toString(arr));
    }
}
