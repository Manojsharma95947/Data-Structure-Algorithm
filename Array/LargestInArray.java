

public class LargestInArray{

    public static int largest(int [] numbers){
        int largest= Integer.MIN_VALUE;
        for(int num : numbers){
            if(num>largest){
                largest = num;
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int numbers[] = {5,48,78,21,57};
        System.out.println("The largest value in array is "+ largest(numbers));

    }
}
