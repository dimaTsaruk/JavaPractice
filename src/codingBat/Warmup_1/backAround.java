package codingBat.Warmup_1;

public class backAround {
    public static void main(String[] args) {
        /**
         * Given a string, take the last char and return a new string with
         * the last char added at the front and back, so "cat" yields "tcatt".
         * The original string will be length 1 or more.
         *
         * backAround("cat") → "tcatt"
         * backAround("Hello") → "oHelloo"
         * backAround("a") → "aaa"
         */

    }

    public String backAround(String str) {
        if (str.length() >= 1) {
            char c = str.charAt(str.length() -1);
            return  c + str + c;
        }
        return "-1";
    }

}
