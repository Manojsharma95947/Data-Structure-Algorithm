public class Pairs {

    public static void pair(int [] arr1){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                
                    System.out.print("(" + arr1[i] + "," + arr1[j] + ") ");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int []arr1 = {2,4,6,8,10};
        pair(arr1);
    }
}
