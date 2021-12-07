import java.util.Scanner;

public class hw3_14 {
public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("a1, ..., a10=");
        long a1 = in.nextInt(), a2 = in.nextInt(), a3 = in.nextInt(), a4 = in.nextInt(), a5 = in.nextInt(), a6 = in.nextInt(), a7 = in.nextInt(), a8 = in.nextInt(), a9 = in.nextInt(), a10 = in.nextInt();
        System.out.println("b1, ..., b10=");
        long b1 = in.nextInt(), b2 = in.nextInt(), b3 = in.nextInt(), b4 = in.nextInt(), b5 = in.nextInt(), b6 = in.nextInt(), b7 = in.nextInt(), b8 = in.nextInt(), b9 = in.nextInt(), b10 = in.nextInt();
        long num1 = a10 + a9*10 + a8*100 + a7*1000 + a6*10000 + a5*100000 + a4*1000000 + a3*10000000 + a2*100000000 + a1*1000000000;
        long num2 = b10 + b9*10 + b8*100 + b7*1000 + b6*10000 + b5*100000 + b4*1000000 + b3*10000000 + b2*100000000 + b1*1000000000;
        System.out.println("num1+num2= " + num1 + num2);

        }
        }
