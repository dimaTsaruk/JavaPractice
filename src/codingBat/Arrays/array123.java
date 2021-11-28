package codingBat.Arrays;

public class array123 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 1};
        System.out.println(array123(array));
    }

    public static boolean array123(int[] nums) {
        int[] newArray = new int[nums.length + 2];

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1) {
                if (nums[i + 1] == 2) {
                    if (nums[i + 2] == 3) {
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
