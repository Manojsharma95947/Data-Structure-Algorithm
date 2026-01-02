package MaxSubArray;

public class Kadanes {
    // Kadanes Algorithm 

    public static void kadane(int [] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }

    // Another version of kadane's algorithm 

    public static void kadanes(int [] arr2){
            int ms = arr2[0];
            int cs = arr2[0];

            for (int i = 1; i < arr2.length; i++) {
                cs = Math.max(arr2[i], arr2[i] + cs);

                ms = Math.max(cs,ms);
            }
            System.out.println(ms);
    }
    public static void main(String[] args) {
        int [] arr1 ={-2,-3,4,-1,-2,1,5,-3};
        kadane(arr1);


        int [] arr2 = { -1,-2,-3};
        kadanes(arr2);
    }
}
