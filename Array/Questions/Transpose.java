package Questions;

public class Transpose {

    public static void transpose(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int [][] tmatrix = new int[col][row]; 

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tmatrix[j][i] = matrix[i][j];
            }
        }

        print(tmatrix);
    }

    public static void print(int[][]matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}
                        };
        transpose(matrix);
        
    }
}
