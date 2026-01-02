package MaxSubArray;

public class PrefixSum {
    
    // Prefix Sum

    public static void prefixSum(int [] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int [] prefixArr = new int[arr.length];
        prefixArr[0] = arr[0]; 

        // calculate prefix arr
        for (int i = 1; i < prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i-1]+ arr[i];
            System.out.println(prefixArr[i]);
        }


        // Main Arr

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = (i == 0) ? prefixArr[j] : prefixArr[j] - prefixArr[i-1] ;
            }
            System.out.print(currSum + " ");

            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("the max Sum of subarray is "+ maxSum);

    }
   public static void main(String[] args) {
    int []arr = {-3,4,-2,5,-2};
    prefixSum(arr);
   }
}
