package Questions;
public class Rotated {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>=nums[left]){
                if(target <= nums[mid] && target >= nums[left]){
                    right = mid;
                }else{
                    left = mid+1;
                }
            }else{
                if( target>nums[mid] && target <= nums[right]){
                    left = mid+1;
                }else{
                    right = mid;
                }
            }
           
        }
          return -1;       
    }
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2,3};
        int target = 0;
        System.out.println(search(arr,target));
        
    }
}
