package codingBat.Array1;

public class maxTriple {
    public static void main(String[] args) {
        /**
         * Given an array of ints of odd length, look at the first, last,
         * and middle values in the array and return the largest. The array length will be a least 1.
         *
         * maxTriple([1, 2, 3]) → 3
         * maxTriple([1, 5, 3]) → 5
         * maxTriple([5, 2, 3]) → 5
         */
    }

    public int maxTriple(int[] nums) {
        if (nums.length >= 1) {
            return (nums[0] > nums[nums.length / 2] && nums[0] > nums[nums.length - 1]) ? nums[0] :
                    (nums[nums.length / 2] > nums[0] && nums[nums.length / 2] > nums[nums.length - 1]) ?
                            nums[nums.length / 2] : nums[nums.length - 1];
        } else return -1;

    }

}
