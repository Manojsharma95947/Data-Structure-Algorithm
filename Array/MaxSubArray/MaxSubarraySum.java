package MaxSubArray;
public class MaxSubarraySum {

    // Brute Force Solution

    public static void MaxSubarraySums(int [] arr ){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentSum = 0;
                for (int k = i; k <=j; k++) {
                    currentSum += arr[k];
                }
                System.out.println(currentSum);
                if(currentSum>maxSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("The max subarray sum is "+ maxSum);
    }

    public static void main(String[] args) {

        int []arr = {-3,4,-2,5,-2};
        MaxSubarraySums(arr);

    }
}
