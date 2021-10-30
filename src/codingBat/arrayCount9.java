package codingBat;

public class arrayCount9 {
    /*
    Given an array of ints, return the number of 9's in the array.
        arrayCount9([1, 2, 9]) → 1
        arrayCount9([1, 9, 9]) → 2
        arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public static void main(String[] args) {

    }

    public static int arrayCount9(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) sum += 1;
            else sum = sum;
        }
        return sum;
    }
}
