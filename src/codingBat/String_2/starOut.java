package codingBat.String_2;

public class starOut {
    /**
     * Return a version of the given string,
     * where for every star (*) in the string the star
     * and the chars immediately to its left and right are gone.
     * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
     * <p>
     * starOut("ab*cd") → "ad"
     * starOut("ab**cd") → "ad"
     * starOut("sm*eilly") → "silly"
     */

    public String starOut(String str) {
        int starIndex = str.indexOf('*');
        String s = "";

        /*
        1. str equals to '*' -> return ""
        2. str doesn't contain '*' -> return str
        3. str starts with '*' and ends with '*' (no more '*') -> return substring(2, str.length -2 );
         */


        if (str.equals('*')) return "";
        if (!str.contains("*")) return str;
        if (str.startsWith("*") && str.endsWith("*") && !str.substring(1, str.length() - 1).contains("*"))
            return str.substring(2, str.length() - 2);

        for (int i = 0; i < str.length(); i++) {

        }
        return "";

    }


}

