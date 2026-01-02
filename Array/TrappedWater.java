public class TrappedWater {

    public static int TrappedWaters(int[] arr){

    // LeftMax
    int[] leftMax = new int[arr.length];
    leftMax[0] = arr[0];

    for (int i = 1; i < arr.length; i++) {
        leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        System.out.print(leftMax[i] + " ");
    }
    System.out.println();

    // RightMax
    int [] rightMax = new int[arr.length];
    rightMax[arr.length-1] = arr[arr.length-1];

    for (int i = arr.length-2; i >=0; i--) {
        rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        System.out.print(rightMax[i]+ " ");
    }
    System.out.println();

    
    int trappedWater =0;
    for (int i = 0; i < arr.length; i++) {

        // WaterLevel
        int waterLevel= Math.min(leftMax[i],rightMax[i]);
        System.out.print(waterLevel +" ");

        // TrappedWater
         trappedWater += waterLevel - arr[i];
    }
    System.out.println();

    return trappedWater;
 
    }
    

    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};           // It is bar height of each bar.
        System.out.println("THe total water trapped inside the valley is "+TrappedWaters(arr));
    }
}
