package Questions;
// Find first and last position of element in sorted array
public class Search {

    // public static int[] searchIndex(int [] arr,int target){
        // linearly search

        // int first = -1;
        // int last = -1;

        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]==target){
        //         if(first == -1){
        //             first = i;
        //         }
        //         last = i;
        //     }
        // }
        // return new int []{first,last};

    //}
        // binarly

    public static int[] searchRange(int [] arr,int target){
        int[] res = {-1,-1};
        res[0] = searchIndex(arr, target, true);
        res[1] = searchIndex(arr, target, false);
        return res;
    }


         public static int searchIndex(int [] arr,int target,boolean isFirst){
        int low = 0;
        int high = arr.length-1;
        int pos = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(target == arr[mid]){
                pos = mid;
                if(isFirst){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else if(target<arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return pos;
    }



    public static void main(String[] args) {
        int [] arr ={5,7,7,8,8,10};

        int target= 8;
        int [] result =  searchRange(arr,target);
        System.out.println("first position is : " + result[0] + " & Last position is : " + result[1]);
    }
}
