package codingBat.Array1;

public class has23 {
    public static void main(String[] args) {
        /**
         *
         Given an int array length 2, return true if it contains a 2 or a 3.

         has23([2, 5]) → true
         has23([4, 3]) → true
         has23([4, 5]) → false
         */
    }

    public boolean has23(int[] nums) {
        if (nums.length >= 2)
            return (nums[0] == 2 || nums[1] == 3 || nums[0] == 3 || nums[1] == 2);
        else return false;

    }

}
