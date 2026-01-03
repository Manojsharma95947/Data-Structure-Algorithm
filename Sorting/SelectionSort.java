package Sorting;

public class SelectionSort {

    // Ascending Order

    public static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min= i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
       }
    }

    // Decreasing Order

    public static void reverseSelectionSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]<arr[j]){
                    min =j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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

        int[] arr = {5,4,1,3,2};
        selectionsort(arr);
        print(arr);

        
        int [] arr1 = {3,6,2,1,8,7,4,5,3,1};
        reverseSelectionSort(arr1);
        print(arr1);
        
    }
}
