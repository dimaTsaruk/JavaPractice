package codingBat.Warmup_2;

public class doubleX {
    /**
     * Given a string, return true if the first instance of "x"
     * in the string is immediately followed by another "x".
     * <p>
     * doubleX("axxbb") → true
     * doubleX("axaxax") → false
     * doubleX("xxxxx") → true
     */
    public static void main(String[] args) {


        System.out.println(doubleX("xaxxx"));
    }

    static boolean doubleX(String str) {

        int xIndex = str.indexOf('x');
        for (int i = xIndex; i < str.length() - 1; i++) {
            if (str.charAt(i + 1) == 'x')
                return true;
        }
        return false;
    }
}

