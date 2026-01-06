package Arrays_2D.Matrix;

public class DiagonalMatrix {

    // public static void diagonalSum(int [][] matrix){

    //     // Brute force Solution
    //     int sum =0 ;
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix.length; j++) {
    //             if(i==j){
    //                 sum+= matrix[i][j];
    //             }else if(i+j == matrix.length-1){
    //                 sum+= matrix[i][j];
    //             }
    //         }
    //     }
    //     System.out.println(sum);

    // }

    // Optimal Solution

    public static void diagonalSum(int [][] matrix){

        int sum = 0 ;
        for (int i = 0; i < matrix.length; i++) {
            // for primary diagonal
            sum+= matrix[i][i];
            
            // for secondary diagonal
            if(i != matrix.length-1-i  ){
                sum+= matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("The sum of diagonal element is "+sum);

    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}
                        };
        
        diagonalSum(matrix);
    }
}
