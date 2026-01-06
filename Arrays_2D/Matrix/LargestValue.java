package Arrays_2D.Matrix;
import java.util.Scanner;

public class LargestValue {
    public static void largest(int [][] matrix){
        int max = matrix[0][0];
        int maxRow=0,maxColumn =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, matrix[i][j]);  
                maxRow = i;
                maxColumn = j;
            }
        }
        System.out.println("The largest value in matrix is " + max + " At cordinate " + "(" + maxRow + "," + maxColumn + ")");
    }
    public static void main(String[] args) {
        
        int [][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");           
            }
            System.out.println();
        }

        largest(matrix);
        sc.close();
    
    }
}
