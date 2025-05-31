package array;

public class MinMax {
    public static void main(String[] args) {
        int arr[]={1, 34, 56, 77};
        int n= arr.length;
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        for (int i=0; i<n ; i++){
            if (arr[i] > max ){
                max= arr[i];
            } 
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.err.println(max + " " + min);
    }
}
