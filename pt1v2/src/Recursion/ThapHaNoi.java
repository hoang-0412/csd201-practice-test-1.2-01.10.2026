package Recursion;

public class ThapHaNoi {

    public static void towerOfHanoi(int n, char fromPeg, char auxPeg, char toPeg) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromPeg + " to " + toPeg);
            return;
        }
        towerOfHanoi(n - 1, fromPeg, toPeg, auxPeg);
        System.out.println("Move disk " + n + " from " + fromPeg + " to " + toPeg);
        towerOfHanoi(n - 1, auxPeg, fromPeg, toPeg);
    }

    public static void main(String[] args) {
        int disks = 3;
        towerOfHanoi(disks, 'A', 'B', 'C');
    }
}
