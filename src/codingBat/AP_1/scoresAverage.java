package codingBat.AP_1;

import java.util.Map;

public class scoresAverage {
    /**
     * Given an array of scores, compute the int average of the first half and the second half,
     * and return whichever is larger. We'll say that the second half begins at index length/2.
     * The array length will be at least 2. To practice decomposition, write a separate helper method
     * int average(int[] scores, int start, int end)
     * { which computes the average of the elements between indexes start..end.
     * Call your helper method twice to implement scoresAverage().
     * Write your helper method after your scoresAverage() method in the JavaBat text area.
     * Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
     * <p>
     * <p>
     * scoresAverage([2, 2, 4, 4]) → 4
     * scoresAverage([4, 4, 4, 2, 2, 2]) → 4
     * scoresAverage([3, 4, 5, 1, 2, 3]) → 4
     */

    public static void main(String[] args) {

        System.out.println(scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
    }

    public static int scoresAverage(int[] scores) {
        if (scores.length == 2) return Math.max(scores[0], scores[1]);
        int start = 0;
        int end = scores.length / 2;
        int aver1 = average(scores, start, end);
        int aver2 = average(scores, end, scores.length - 1);

        if (aver1 > aver2)
            return aver1;
        else return aver2;
    }

    public static int average(int[] scores, int start, int end) {

        int sum = 0;
        for (int i = start; i < end; i++) {
            sum = sum + scores[i];
        }
        return sum / (end - start);

    }

}

