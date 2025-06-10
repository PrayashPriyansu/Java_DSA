package array;

import java.util.ArrayList;

public class CommonSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7};
        int[] arr3 = {8,9,10};

        int i=0;
        int j=0;
        int k=0;
        ArrayList<Integer> result= new ArrayList<>();


        while(i < arr1.length && j < arr2.length && k < arr3.length){
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else {
                if (arr1[i] < arr2[j] && arr1[i] < arr3[k] ){
                    i++;
                } else if (arr2[j] < arr1[i] && arr2[j] < arr3[k] ) {
                    j++;
                } else if (arr3[k] < arr1[i] && arr3[k] < arr2[j] ) {
                    k++;
                }
            }
        }

        System.out.println(result.toArray().length >0 ? result : -1 );
    }
}
