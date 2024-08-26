package core.java;
//Time Complexity: O(n), where n is a number of characters in the stack.
//Auxiliary Space: O(n) for the stack.
import java.util.Stack;

//Reverse a String using Stack
public class StackStringReverse {

    public static void main(String[] s) {
        String str = "GeeksForGeeks";
        String reverseStr = reverseString(str);
        System.out.println(reverseStr);

        String str1 = "Hello World";
        String reverseStr1 = reverseString(str1);
        System.out.println(reverseStr1);
    }

    private static String reverseString(String str) {
        char[] reverseStr = new char[str.length()];
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));
        }
        int i = 0;
        while( !stack.isEmpty()) {
            reverseStr[i++] = stack.pop();
        }
        return new String(reverseStr);
    }
}
