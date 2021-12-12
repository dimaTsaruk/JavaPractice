package codingBat.String_2;

public class prefixAgain {
    /**
     * Given a string, consider the prefix string made
     * of the first N chars of the string.
     * Does that prefix string appear somewhere else in the string?
     * Assume that the string is not empty and that
     * N is in the range 1..str.length().
     * <p>
     * prefixAgain("abXYabc", 1) → true
     * prefixAgain("abXYabc", 2) → true
     * prefixAgain("abXYabc", 3) → false
     */
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        if (str.substring(n).contains(prefix)) return true;
        return false;

    }

}
