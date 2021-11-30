package codingBat.Strings;

public class lastTwo {
    public static void main(String[] args) {
        /**
         * Given a string of any length, return a new string where the last 2 chars,
         * if present, are swapped, so "coding" yields "codign".
         *
         * lastTwo("coding") → "codign"
         * lastTwo("cat") → "cta"
         * lastTwo("ab") → "ba"
         */
    }

    public String lastTwo(String str) {
        if (str.length() < 2)
            return str;
        else {
            char a = str.charAt(str.length() - 1);
            char b = str.charAt(str.length() - 2);
            return (str.length() >= 2) ? str.substring(0, str.length() - 2) + a + b : "-1";
        }
    }

}
