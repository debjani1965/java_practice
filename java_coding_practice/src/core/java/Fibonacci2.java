package core.java;
//Time Complexity: O(N)
//Auxiliary Space: O(1)
public class Fibonacci2 {
    public static void main(String s[]) {
        int num = 10;
        for(int i=0; i<num; i++) {
            System.out.println(fibo(i));
        }
    }

    private static int fibo(int n) {
//        if( n <= 1 ) {
//            return n;
//        }
//        return fibo( n - 1) + fibo(n-2);
        int f[] = new int[n + 2];
        f[0] = 0;
        f[1] = 1;

        for( int i = 2; i<=n; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }
}
