package Recursion;

public class TailRecursion {

    public static long factorialTail(int n, long acc) {
        if (n <= 1) {
            return acc;
        }
        return factorialTail(n - 1, n * acc);
    }

    public static void main(String[] args) {
        int n = 5;
        long result = factorialTail(n, 1);
        System.out.println(n + " Tail Recursion = " + result);
    }
}