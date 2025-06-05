package array;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr= { 2, 3, -8, 7, -1, 2, 3};

        int max=Integer.MIN_VALUE;
        int start=0;
        int maxStart=0;
        int maxEnd=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
            if (sum>max) {
                max = sum;
                maxStart=start;
                maxEnd= i;
            }
            if (sum <0){
                start=i+1;
                sum=0;
            }
        }

        for (; maxStart<= maxEnd; maxStart++){
            System.out.println(arr[maxStart]);
        }
        System.out.println(max);
    }
}
