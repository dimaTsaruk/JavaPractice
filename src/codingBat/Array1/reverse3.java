package codingBat.Array1;

import java.util.Arrays;
import java.util.Collections;

public class reverse3 {
    public static void main(String[] args) {
        /**
         * Given an array of ints length 3, return a new array with the elements in reverse order,
         * so {1, 2, 3} becomes {3, 2, 1}.
         *
         * reverse3([1, 2, 3]) → [3, 2, 1]
         * reverse3([5, 11, 9]) → [9, 11, 5]
         * reverse3([7, 0, 0]) → [0, 0, 7]
         */
    }

    public int[] reverse3(int[] nums) {
        int[] rev = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            rev[i] = nums[nums.length - 1 - i];
        return rev;
    }

}
