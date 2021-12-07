import java.lang.Math;
import java.util.Scanner;

public class hw4_11 {
    public static boolean ifArms(String num) {
        int test = num.chars().map(ch -> ch - '0').map(i -> (int) Math.pow(i, num.length())).sum();
        return test == Integer.parseInt(num);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter left and right borders : ");
        int left = in.nextInt(),right = in.nextInt();
        for (int i = left; i < right; i++) {
            if (ifArms(String.valueOf(i)))
                System.out.println(i);
        }

    }
}
