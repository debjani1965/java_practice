package core.java;

public class AddLeadingZerosToEnd {
    public static void main(String[] s) {
        String str = "00001234";
        String zeros = "";
        int count = 0;

        while( count < str.length() && str.charAt(count) == '0') {
            count++;
        }
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, count, "");
        for(int i = 0; i< count; i++) {
            sb.append('0');
        }
        System.out.println(sb.toString());
    }
}
