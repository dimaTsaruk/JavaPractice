package codingBat.Logic1;

public class lastDigit {
    public static void main(String[] args) {
        /**
         * Given three ints, a b c, return true if two or more of them have the same rightmost digit.
         * The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
         *
         * lastDigit(23, 19, 13) → true
         * lastDigit(23, 19, 12) → false
         * lastDigit(23, 19, 3) → true
         */
    }

    public boolean lastDigit(int a, int b, int c) {
        if (a >= 0 && b >= 0 && c >= 0)
            return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10);
        else return false;

    }

}
