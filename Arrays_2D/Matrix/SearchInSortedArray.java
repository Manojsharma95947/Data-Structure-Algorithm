package Arrays_2D.Matrix;
// There are three approach in which we can solve this problem
// 1. Brute force
// 2. Binary search
// 3. Staircase search
public class SearchInSortedArray {

    // 1. Brute force
    // Time complexity: O(n^2)
    // public static void search(int[][] matrix,int target){
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if(matrix[i][j]==target){
    //                 System.out.println("Target is found at index ("+i+","+j+")");
    //             }
    //         }
    //     }
    // }

    // 2. Binary Search
    // Time Complexity : O(nlogn)

    // public static int SearchBinarily(int[][] matrix,int target){
    //     int low = 0;
    //     int row = matrix.length;
    //     int col = matrix[0].length;
    //     int high = (row*col) -1;

    //     while(low<=high){
    //         int mid = low + (high-low)/2;
    //         int midrow = mid/col;
    //         int midcol = mid% col;
    //         int midvalue = matrix[midrow][midcol];

    //             if(midvalue == target){
    //                 return mid;
    //             }else if(midvalue<target){
    //                 low = mid+1;
    //             }else{
    //                 high = mid-1;
    //             }
    //         }
    //         return -1;
    // }

    // 3.Staircase search
    // Time Complexity depends on the length of row or col which one have greater length
    // Therefore Time Complexity: O(n+m);

    // public static boolean staircase(int [][] matrix,int target){
    //     int row = 0;
    //     int col = matrix[0].length-1;
    //     while(row<matrix.length && col>=0){
    //         if(matrix[row][col] == target){
    //             System.out.println("Element is found at ("+ row + "," + col + ")");
    //             return true;
    //         }else if(matrix[row][col]<target){
    //             row++;
    //         }else{
    //            col--; 
    //         }
    //     }
    //     return false;
    // }


    

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}
                        };

        // search(matrix, 11);
        // SearchBinarily(matrix, 11);
        // staircase(matrix,11);
    }
}
