package codingBat.Warmup_1;

public class intMax {
    public static void main(String[] args) {
        /**
         *
         Given three int values, a b c, return the largest.

         intMax(1, 2, 3) → 3
         intMax(1, 3, 2) → 3
         intMax(3, 2, 1) → 3
         */

    }

    public int intMax(int a, int b, int c) {
       // return (a > b && b > c) ? a : (b > c && b > a) ? b : c;
        return (a >= b && a >= c) ? a : (b >= a && b >= c )? b : c;
    }

}

