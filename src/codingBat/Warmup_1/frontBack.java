package codingBat.Warmup_1;

public class frontBack {
    public static void main(String[] args) {
        /**
         * Given a string, return a new string where the first and
         * last chars have been exchanged.
         *
         * frontBack("code") → "eodc"
         * frontBack("a") → "a"
         * frontBack("ab") → "ba"
         */
    }

    public String frontBack(String str) {
        /*if (str.length() >= 2) {
            char f = str.charAt(0);
            char b = str.charAt(str.length() - 1);
            String sub = str.substring(1, str.length() - 1);
            return b + sub + f;
        }
        return str;*/
        return (str.length() >= 2) ?
                (str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0)) : str;

    }

}
