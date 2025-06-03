package array;

public class KthMinMax {
    public static void main(String[] args) {
        int k=2;
        int[] n = {3,6,1,9,3,8,55,33,22,77};
        sort(n);
        for (int j : n) {
            System.out.println(j);
        }
        System.out.println(k+"th Max:"+n[n.length-k]+"  "+ k +"th Min:"+n[k]);
    }
    public static void sort(int[] arr){
        int n=arr.length;
        for (int i=0; i< n-1; i++){
            for (int j=i+1; j<n-1; j++){
                if (arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
    }
}
