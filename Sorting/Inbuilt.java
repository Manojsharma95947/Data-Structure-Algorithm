package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class Inbuilt {

    public static void print(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        Integer [] arr = {1,4,1,3,2,4,3,7};
        Arrays.sort(arr);
        print(arr);
        System.out.println();

        Arrays.sort(arr,Collections.reverseOrder()); // To run collection method we have to use Integer object array data type 
        print(arr);





    }
    
}
