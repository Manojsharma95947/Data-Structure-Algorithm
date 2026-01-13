package Questions;

public class Count {

    // brute force(n^2)

    public static int count(int[][] matrix,int target){
        int row = matrix.length;
        int col = matrix[0].length-1;
        int count = 0;

       for (int i = 0; i < row; i++) {
        for (int j = 0; j <= col; j++) {
            if(target == matrix[i][j]){
                count++;
            }
        }
       }
        return count;
    }

    // binary search (if matrix is sorted row by row)
    // Learn it.
    // perform binary search on each row and return count.
    






    public static void main(String[] args) {
         int [][] matrix = {{1,2,3,4},
                           {4,5,6,8}    
                        };

    
    System.out.println(count(matrix, 4));
    }
}
