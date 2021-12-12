package codingBat.Warmup_2;

public class stringTimes {
    /**
     * Given a string and a non-negative int n,
     * return a larger string that is n copies of the original string.
     * <p>
     * stringTimes("Hi", 2) → "HiHi"
     * stringTimes("Hi", 3) → "HiHiHi"
     * stringTimes("Hi", 1) → "Hi"
     */

    public String stringTimes(String str, int n) {
        String line = "";
        for (int i = 0; i < n; i++)
            line += str;
        return line;
    }


}

