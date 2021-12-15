package codingBat.AP_1;

import java.util.Arrays;

public class sumHight {
    /**
     * We have an array of heights, representing the altitude along a walking trail.
     * Given start/end indexes into the array, return the sum of the changes for
     * a walk beginning at the start index and ending at the end index.
     * For example, with the heights {5, 3, 6, 7, 2} and start=2,
     * end=4 yields a sum of 1 + 5 = 6. The start and end index will
     * both be valid indexes into the array with start <= end.
     * <p>
     * <p>
     * sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
     * sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
     * sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
     */
    public static void main(String[] args) {
    }


    public int sumHeights(int[] heights, int start, int end) {
        int[] arr = new int[end - start + 1];
        int x = 0;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (arr[arr.length - 1] == 0) {
                arr[x] = heights[i];
                x++;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            sum = sum + Math.abs(arr[i] - arr[i + 1]);
        }
        return sum;
    }


}





