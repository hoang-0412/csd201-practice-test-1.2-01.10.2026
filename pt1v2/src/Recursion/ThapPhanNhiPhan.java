package Recursion;

public class ThapPhanNhiPhan {

    public static void convertBinary(int n) {
        if (n == 0) {
            return;
        }
        convertBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.print("Decimal " + n + " in binary: ");
        if (n == 0) {
            System.out.print(0);
        } else {
            convertBinary(n);
        }
        System.out.println();
    }
}
