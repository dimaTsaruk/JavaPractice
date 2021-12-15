package codingBat.AP_1;

import java.util.Arrays;

public class copyEndy {
    /**
     * We'll say that a positive int n is "endy" if it is in
     * the range 0..10 or 90..100 (inclusive).
     * Given an array of positive ints, return a new array of
     * length "count" containing the first endy numbers from the original array.
     * Decompose out a separate isEndy(int n) method to test if a number is endy.
     * The original array will contain at least "count" endy numbers.
     * <p>
     * <p>
     * copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
     * copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
     * copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(copyEndy(new int[]{9, 11, 90, 22, 6}, 3)));
    }

    public static int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEndy(nums[i]) && arr[arr.length - 1] == 0) {
                arr[x] = nums[i];
                x++;
            }
        }
        return arr;
    }

    public static boolean isEndy(int number) {
        return (number >= 0 && number <= 10 || number >= 90 && number <= 100);
    }

}
