package codingBat.Array_2;

public class bigDiff {
    /**
     * Given an array length 1 or more of ints,
     * return the difference between the largest and smallest values in the array.
     * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
     * methods return the smaller or larger of two values.
     * <p>
     * <p>
     * bigDiff([10, 3, 5, 6]) → 7
     * bigDiff([7, 2, 10, 9]) → 8
     * bigDiff([2, 10, 7, 2]) → 8
     */
    public static void main(String[] args) {
        System.out.println(bigDiff(new int[]{3, 2, 4, 5, 6, 9, 1, 77}));
    }


    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < min)
                min = nums[i + 1];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > max)
                max = nums[i + 1];
        }
        return max - min;
    }

}
