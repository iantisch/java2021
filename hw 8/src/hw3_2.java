import java.util.Scanner;

public class hw3_2 {


    public static void main(String[] args){

        Complex sum = new Complex(0,0);
        //Complex mul = new Complex(1,1);
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = inp.nextInt();
        Complex[] comp_arr = new Complex[n];
        int real_temp,imag_temp;
        for(int i = 0; i<n; i++){
            System.out.println("Enter real : ");
            real_temp = inp.nextInt();
            System.out.println("Enter imagine : ");
            imag_temp = inp.nextInt();
            comp_arr[i] = new Complex(real_temp,imag_temp);
        }
        Complex mul = comp_arr[0];

        for(Complex a : comp_arr){
            sum=sum.add(a);
        }
        for(int b = 1; b < n; b++){
            mul=mul.mul(comp_arr[b]);
        }
        System.out.print("sum = ");sum.print();
        System.out.print("mul = ");mul.print();


    }

}
