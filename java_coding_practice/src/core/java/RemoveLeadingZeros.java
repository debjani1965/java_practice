package core.java;
//Remove Leading Zeros From String in Java
public class RemoveLeadingZeros {
    public static void main(String[] s) {
        String str = "0000123040";

        str = removeLeadingZeros(str);

        System.out.println(str);

    }

    private static String removeLeadingZeros(String str) {
        int count = 0;
        while( count < str.length() && str.charAt(count) == '0') {
                count++;
        }
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, count, "");

        return sb.toString();
    }
}
