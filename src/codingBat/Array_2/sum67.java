package codingBat.Array_2;

import java.util.Arrays;

public class sum67 {
    /**
     * Return the sum of the numbers in the array,
     * except ignore sections of numbers starting with
     * a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
     * Return 0 for no numbers.
     * <p>
     * sum67([1, 2, 2]) → 5
     * sum67([1, 2, 2, 6, 99, 99, 7]) → 5
     * sum67([1, 1, 6, 7, 2]) → 4
     */
    public static void main(String[] args) {
       // System.out.println(sum67(new int[]{2, 3, 4, 5}));
        System.out.println(sum67(new int[]{ 2, 6, 99, 99, 7}));
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                while (i < nums.length && nums[i] != 7) {
                    sum += 0;
                    i++;
                }
            } else
                sum += nums[i];
        }
        return sum;
    }
}

