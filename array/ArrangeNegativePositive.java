package array;

public class ArrangeNegativePositive {
    public static void main(String[] args){
        int[] arr=  {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int l=0, r= arr.length-1;
        while (l < r){
            if (arr[l]< 0){
                l++;
            } else {
                int temp=arr[r];
                arr[r]=arr[l];
                arr[l]=temp;
                r--;
            }
        }
        for (int num: arr){
            System.out.println(num);
        }
    }
}
