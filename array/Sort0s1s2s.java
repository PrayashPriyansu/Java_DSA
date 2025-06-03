package array;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,2,0,1,2};
        int low=0, mid=0, high= arr.length -1;
        while (mid <= high){
            switch (arr[mid])
            {
                case 0:
                    int temp=arr[mid];
                    arr[mid] =arr[low];
                    arr[low]= temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2=arr[mid];
                    arr[mid] =arr[high];
                    arr[high]= temp2;
                    high--;
                    break;
            }

        }
        for (int num: arr){
            System.out.println(num);
        }
    }
}
