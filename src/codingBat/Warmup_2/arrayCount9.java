package codingBat.Warmup_2;

public class arrayCount9 {
    /**
     * Given an array of ints, return the number of 9's in the array.
     * <p>
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     */

    public int arrayCount9(int[] nums) {
        int count = 0;
        if(nums.length != 0) {
            for(int i = 0; i < nums.length; i++)
                if (nums[i] == 9)
                    count++;
        }
        return count;
    }

}
