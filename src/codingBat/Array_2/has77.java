package codingBat.Array_2;

public class has77 {
    /**
     * Given an array of ints, return true if the array contains two 7's
     * next to each other, or there are two 7's separated by one element,
     * such as with {7, 1, 7}.
     * <p>
     * <p>
     * has77([1, 7, 7]) → true
     * has77([1, 7, 1, 7]) → true
     * has77([1, 7, 1, 1, 7]) → false
     */
    public static void main(String[] args) {
        System.out.println(has77(new int[]{2, 7, 2, 2, 7, 2}));
    }

    public static boolean has77(int[] nums) {
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] == 7 && nums[i + 1] != 7)
                return false;
            else if (nums[i] == 7 && nums[i + 2] != 7)
                return false;
        }
        return true;
    }

}
