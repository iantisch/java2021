import java.util.Scanner;

public class hw4_1b {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("x=");
        long x = in.nextInt(), x2 = x*x, x3 = x2*x, x4 = x2 * x2;
        System.out.println("y = " + (x4 + x3 + x2 + x + 1));
    }
}