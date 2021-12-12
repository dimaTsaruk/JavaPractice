package codingBat.Warmup_2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class array123 {
    /**
     * Given an array of ints, return true if the
     * sequence of numbers 1, 2, 3 appears in the array somewhere.
     * <p>
     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     */
    public static void main(String[] args) {


    }


    public boolean array123(int[] nums) {
        String sNums = "";
        for (int i = 0; i < nums.length; i++)
            sNums += nums[i];
        return sNums.contains("123");
    }

}
