package Recursion;

public class NonTailRecursion {

    public static long factorialNonTail(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialNonTail(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        long result = factorialNonTail(n);
        System.out.println(n + " Non-Tail Recursion = " + result);
    }
}