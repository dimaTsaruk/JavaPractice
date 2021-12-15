package codingBat.Logic_2;

public class loneSum {
    /**
     * Given 3 int values, a b c, return their sum. However,
     * if one of the values is the same as another of the values,
     * it does not count towards the sum.
     * <p>
     * <p>
     * loneSum(1, 2, 3) → 6
     * loneSum(3, 2, 3) → 2
     * loneSum(3, 3, 3) → 0
     */

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a == b && b == c) return sum;
        else if (a == b || a == c) sum = a + b;
        else if (b == c) sum = a + c;
        return a + b + c;

    }

}
