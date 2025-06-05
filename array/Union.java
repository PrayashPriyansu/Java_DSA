package array;


import java.util.Arrays;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2, 3};
        HashSet<Integer> result = new HashSet<>();

        for (int num : arr1) {
            result.add(num);
        }
        for (int num : arr2) {
            result.add(num);
        }
        int[] arr = result.stream().mapToInt(Integer::intValue).toArray();

        Arrays.stream(arr).forEach(System.out::println);

    }
}
