package Questions;
import java.util.Scanner;


public class SumOfGivenRow {
    public static void rowSum(int [][] matrix,int row){
        int sum =0;

        if(row<0 || row>= matrix.length){
            System.out.println("Error Out of bound");
            return;
        }

        for (int j = 0; j < matrix[row].length; j++) {
            sum += matrix[row][j];
        }

        System.out.println("Sum of given row is "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row ");
        int row = sc.nextInt();
        int [][] matrix = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}
                        };
        rowSum(matrix,row);

        sc.close();
    }
}
