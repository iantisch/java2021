import java.util.Scanner;

public class hw2_14 {
    public static boolean is_even(int num){
        if (((num & 1) ==0)) return true;
        else return false;

    }
    public static int[][] enter_matrix(int N){
        int[][] matrix = new int[N][N];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < N;i++){
            for(int j = 0; j < N;j++){
                System.out.printf("enter x%d y%d: ", i, j);
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }

    public static void bit_change(int[][] matrix){
        int rows, cols;
        int[][] copy = matrix;
        rows = copy.length;
        cols = copy[0].length;

        for(int i = 0; i < rows;i++){
            for(int j = 0; j < cols;j++){

                if(copy[i][j] == 0){
                    copy[i][j] = 1;
                    if(parity_check(copy,0) == true){
                        System.out.printf("change x%d y%d to make parity ",i,j);
                        return;
                    }
                    copy[i][j] = 0;
                }

                if(copy[i][j] == 1){
                    copy[i][j] = 0;
                    if(parity_check(copy,0) == true){
                        System.out.printf("change x%d y%d to make parity ",i,j);
                        return;
                    }
                    copy[i][j] = 1;
                }

            }
        }
    }


    public static boolean parity_check(int[][] matrix,int type){
        int rows, cols, sumRow, sumCol,counter = 0;
        rows = matrix.length;
        cols = matrix[0].length;
        //Calculates sum of each row of given matrix
        for(int i = 0; i < rows; i++){
            sumRow = 0;
            for(int j = 0; j < cols; j++){
                sumRow = sumRow + matrix[i][j];
            }
            if (is_even(sumRow) == false) counter++;
        }
        //Calculates sum of each column of given matrix
        for(int i = 0; i < cols; i++){
            sumCol = 0;
            for(int j = 0; j < rows; j++){
                sumCol = sumCol + matrix[j][i];
            }
            if (is_even(sumCol) == false) counter++;
        }
        if((counter > 0) & type == 1) {
            bit_change(matrix);
            return false;
        }
        if((counter > 0) & type == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter N:");
        int N = in.nextInt();
        int[][] ParityMatrix = enter_matrix(N);
        if(parity_check(ParityMatrix,1) == false) System.out.println("is not parity matrix ");
        else System.out.println("Is parity matrix ");
    }


}
