import java.util.*;

public class hw4_18 {




    public static void main(String[] args){
        //CharSet a = new CharSet();
        Scanner inp = new Scanner(System.in);
        System.out.println("n = ");
        int n = inp.nextInt();String temp_text;
        String[] temp_arr = new String[n];
        inp.nextLine();
        for(int i = 0;i<n;i++){
            temp_text = inp.nextLine();
            temp_arr[i] = temp_text;
        }
        CharSet a = new CharSet(temp_arr); //создание множенства из элементов массива
        //System.out.println(a.a.size());
    }

}
