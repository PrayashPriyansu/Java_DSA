package array;

public class RotateClockWise {
    public static void main(String[] args){
        int[] arr={1,4,6,2,7,8,9};

        int n=arr.length;

        int temp= arr[n-1];

        for (int i=n-2; i>=0; i--){
            arr[i+1]=arr[i];
        }

        arr[0]=temp;

        for (int num: arr){
            System.out.println(num);
        }
    }
}
