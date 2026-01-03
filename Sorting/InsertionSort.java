package Sorting;

public class InsertionSort {

    // Ascending Order

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev] > current){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;   
        }
    }

    // Decreasing order
    
    public static void reverseInsertionSort(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int prev = i-1;

            while (prev>=0 && arr[prev] < current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev+1] = current;
        } 
    }

    // Print Function 

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int [] arr = {5,4,1,3,2};
        insertionSort(arr);
        print(arr);


        int [] arr1 = {3,6,2,1,8,7,4,5,3,1};
        reverseInsertionSort(arr1);
        print(arr1);
        
    }
}
