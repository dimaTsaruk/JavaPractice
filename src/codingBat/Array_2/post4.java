package codingBat.Array_2;

public class post4 {
    /**
     * Given a non-empty array of ints,
     * return a new array containing the elements from the original array that
     * come after the last 4 in the original array.
     * The original array will contain at least one 4.
     * Note that it is valid in java to create an array of length 0.
     * <p>
     * <p>
     * post4([2, 4, 1, 2]) → [1, 2]
     * post4([4, 1, 4, 2]) → [2]
     * post4([4, 4, 1, 2, 3]) → [1, 2, 3]
     */
    public int[] post4(int[] nums) {

        int index4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4)
                index4 = i;
        }
        index4++;
        int[] arr = new int[nums.length - index4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[index4 + i];
        }
        return arr;

    }

}
