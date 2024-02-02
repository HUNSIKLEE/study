import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 1, 5, 10};
        int[] arr2 = new int[]{3, 1, 5, 5, 3, 3, 5};
        int[] arr3 = new int[]{4, 1, 5, 5, 3, 3, 5, 4, 5};
        int[] arr4 = new int[]{2, 2, 1, 2, 1};
        int[] arr5 = new int[]{2, 4, 6, 4, 4};

        System.out.println(getResult(arr1));
        System.out.println(getResult(arr2));
        System.out.println(getResult(arr3));
        System.out.println(getResult(arr4));
        System.out.println(getResult(arr5));
    }

    public static int getResult(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        for (int count : countMap.values()) {
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}