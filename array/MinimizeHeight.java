package array;

public class MinimizeHeight {
    public static void main(String[] args){
        int[] arr = {1, 5, 8, 10};
        int k=2;
        int min= arr[0]+k;
        int max= arr[arr.length-1] - k;
        for (int i=1; i< arr.length-2; i++){
            if (arr[i] - k < max ){
                arr[i]=arr[i]-k;
            } else {
                arr[i]=arr[i]+k;
            }
        }
    }
}
