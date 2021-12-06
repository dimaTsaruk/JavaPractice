package codingBat.Array1;

public class maxEnd3 {
    public static void main(String[] args) {
        /**
         * Given an array of ints length 3, figure out which is larger,
         * the first or last element in the array, and set all the other elements to be that value.
         * Return the changed array.
         *
         * maxEnd3([1, 2, 3]) → [3, 3, 3]
         * maxEnd3([11, 5, 9]) → [11, 11, 11]
         * maxEnd3([2, 11, 3]) → [3, 3, 3]
         */
    }

    public int[] maxEnd3(int[] nums) {

        return (nums[0] > nums[nums.length - 1]) ? new int[]{nums[0], nums[0], nums[0]} :
                new int[] {nums[nums.length - 1],nums[nums.length - 1],nums[nums.length - 1]};

        /*int[] arr = new int[nums.length];
        if (nums[0] > nums[2]) {
            arr[0] = nums[0];
            arr[1] = nums[0];
            arr[2] = nums[0];
        } else {
            arr[0] = nums[2];
            arr[1] = nums[2];
            arr[2] = nums[2];
        }
        return arr;*/
    }
}
