package codingBat.Array1;

public class makeMiddle {
    public static void main(String[] args) {
        /**
         *
         Given an array of ints of even length, return a new array length 2 containing the middle
         two elements from the original array. The original array will be length 2 or more.

         makeMiddle([1, 2, 3, 4]) → [2, 3]
         makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
         makeMiddle([1, 2]) → [1, 2]
         */
    }

    public int[] makeMiddle(int[] nums) {

        int[] arr = new int[2];
        if (nums.length > 2) {
            arr[0] = nums[nums.length / 2 - 1];
            arr[1] = nums[nums.length / 2];

        } else return nums;
        return arr;
    }

}
