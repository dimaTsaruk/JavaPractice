package codingBat.Warmup_2;

import java.util.Arrays;

public class has271 {
    /**
     * Given an array of ints, return true if it contains
     * a 2, 7, 1 pattern: a value, followed by the value plus 5,
     * followed by the value minus 1. Additionally the 271
     * counts even if the "1" differs by 2 or less from the correct value.
     * <p>
     * <p>
     * has271([1, 2, 7, 1]) → true
     * has271([1, 2, 8, 1]) → false
     * has271([2, 7, 1]) → true
     */



    public boolean  has271(int[] nums) {

        String sNums = Arrays.toString(nums);
        return sNums.contains("271");

        /*for (int i = 0; i < nums.length - 3; i++)
            if (i + 3 < nums.length && nums[i] == 2 && nums[i + 1] == nums[i] + 5 && nums[i + 3] == nums[i] - 1 ||
                    nums[i + 3] == nums[i] - 2 || nums[i + 3] == nums[i] - 3) ;
        return true;*/
    }

}
