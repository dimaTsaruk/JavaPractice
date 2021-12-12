package codingBat.String_2;

public class endOther {
    /**
     * Given two strings, return true if either of the strings appears
     * at the very end of the other string, ignoring upper/lower
     * case differences (in other words, the computation should not be "case sensitive").
     * Note: str.toLowerCase() returns the lowercase version of a string.
     * <p>
     * endOther("Hiabc", "abc") → true
     * endOther("AbC", "HiaBc") → true
     * endOther("abc", "abXabc") → true
     */
    public boolean endOther(String a, String b) {
        // if a == b , check if a.equals b
        if (a.length() == b.length() && a.equals(b)) return true;

            // if a > b
            // b appears in a
        else if (a.length() > b.length()) {
            String endA = a.substring(a.length() - b.length());
            if (endA.equalsIgnoreCase(b)) return true;
        } else
        // a appears in b
        {
            String endB = b.substring(b.length() - a.length());
            if (endB.equalsIgnoreCase(a)) return true;
        }

        return false;

    }

}
