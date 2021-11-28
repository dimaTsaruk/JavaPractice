package codingBat.Strings;

public class nonStart {
    public static void main(String[] args) {
        /**
         * Given 2 strings, return their concatenation, except omit the first char of each.
         * The strings will be at least length 1.
         *
         *
         * nonStart("Hello", "There") → "ellohere"
         * nonStart("java", "code") → "avaode"
         * nonStart("shotl", "java") → "hotlava"
         */
    }

    public String nonStart(String a, String b) {
        if (a.length() >= 1 && b.length() >= 1)
            return a.substring(1) + b.substring(1);
        else return "-1";
    }

}
