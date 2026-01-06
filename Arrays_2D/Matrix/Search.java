package Arrays_2D.Matrix;
import java.util.Scanner;

public class Search {

    public static void search(int [][] matrix,int target){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == target){
                    System.out.println("The target is found at " + "(" + i + "," + j + ")");
                }   
            }
        }
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

        search(matrix,6);
        sc.close();
    }
}
