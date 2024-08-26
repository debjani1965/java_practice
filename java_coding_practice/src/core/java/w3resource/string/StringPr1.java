package core.java.w3resource.string;

public class StringPr1 {
    public static void main(String[] s) {
        String str = "My name is Debjani";
        String str1 = "My name is Debjani";
        String str2 = "Debjani Sen";
        String str23 = "Gupta";
        String str3 = "My office name is Persistent";
        int index = 1;
        //Write a Java program to get the character at the given index within the string.
        System.out.println(str.charAt(index));

        //Write a Java program to get the character (Unicode code point) at the given index within the string.
        System.out.println(str.codePointAt(index));

        //Write a Java program to get the character (Unicode code point) before the specified index within the string.
        System.out.println(str.codePointBefore(index));

        //Write a Java program to count Unicode code points in the specified text range of a string
        System.out.println(str.codePointCount(0, 10));
        //Write a Java program to compare two strings lexicographically.
        //Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareTo(str2));
        System.out.println(str.compareTo(str3));

        //Write a Java program to compare two strings lexicographically, ignoring case differences.
        System.out.println(str.compareToIgnoreCase(str1.toLowerCase()));

        //Write a Java program to concatenate a given string to the end of another string.
        System.out.println(str2.concat(" " + str23));
        StringBuffer sb = new StringBuffer("I love");
        StringBuffer sb1 = new StringBuffer("Kolkata");
        sb.append(" ").append(sb1);
        System.out.println(sb);

        //Write a Java program to compare a given string to the specified character sequence.
        String st = "Example.com";
        String st1 = "example.com";
        CharSequence chst = "Example.com";
        StringBuffer sb2 = new StringBuffer("Example.com");
        StringBuffer sb3 = new StringBuffer();
        sb2 = sb3;
        System.out.println(st1.contentEquals(chst));
        System.out.println(st.contentEquals(sb2));
        System.out.println(sb2.equals(sb3));

    }
}

