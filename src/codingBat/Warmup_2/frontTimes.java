package codingBat.Warmup_2;

public class frontTimes {
    /**
     * Given a string and a non-negative int n,
     * we'll say that the front of the string is the first 3 chars,
     * or whatever is there if the string is less than length 3.
     * Return n copies of the front;
     * <p>
     * frontTimes("Chocolate", 2) → "ChoCho"
     * frontTimes("Chocolate", 3) → "ChoChoCho"
     * frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public String frontTimes(String str, int n) {
        String front = "";
        StringBuilder result = new StringBuilder();

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        for (int i = 0; i < n; i++) {
            result.append(front);
        }
        return result.toString();
    }

}




