package codingBat.String_2;

public class xyzThere {
    /**
     * Return true if the given string contains an appearance
     * of "xyz" where the xyz is not directly preceeded by a period (.).
     * So "xxyz" counts but "x.xyz" does not.
     * <p>
     * <p>
     * xyzThere("abcxyz") → true
     * xyzThere("abc.xyz") → false
     * xyzThere("xyz.abc") → true
     */

    public boolean xyzThere(String str) {
        return true;

        /*if (str.length() < 3) return false;

        if (str.contains("xyz") && !str.contains(".xyz")) {
            return true;
        }
        return false;*/

    }

}
