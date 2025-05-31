
package array;


public class Reverse {
     public static void main(String[] args) {
        int arr[] = {1,2,34,45};
        int n=arr.length;
        for (int i=0; i<n/2 ; i++){
            int temp =  arr[i];
            arr[i]= arr[n-i-1];
            arr[n-i-1]= temp;
        }
        for (int i=0; i<n ; i++){
            System.err.println(arr[i]);
        }
    }
}
