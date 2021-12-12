package codingBat.Array_2;

import java.util.Arrays;

public class no14 {
    /**
     * Given an array of ints, return true if it contains no 1's or it contains no 4's.
     * <p>
     * no14([1, 2, 3]) → true
     * no14([1, 2, 3, 4]) → false
     * no14([2, 3, 4]) → true
     */
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1};
        String s = Arrays.toString(arr);
        System.out.println(s);
    }

    public boolean no14(int[] nums) {
        String s = Arrays.toString(nums);
        if (s.contains("1") && s.contains("4") || s.contains("14"))
            return false;
        else return true;
    }

}
