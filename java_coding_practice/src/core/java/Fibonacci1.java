package core.java;

//Time Complexity: O(N)
//Auxiliary Space: O(1)
public class Fibonacci1 {
    public  static  void  main(String s[]) {
        int num = 10;
        fibonacci(num);
    }

    private static void fibonacci(int num) {
        int num1 = 0, num2 = 1;

        for(int i=0; i<num;i++) {
            System.out.println(num1);
            int num3 = num1 +num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
