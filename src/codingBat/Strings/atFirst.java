package codingBat.Strings;

public class atFirst {
    public static void main(String[] args) {
        /**
         * Given a string, return a string length 2 made of its first 2 chars.
         * If the string length is less than 2, use '@' for the missing chars.
         *
         * atFirst("hello") → "he"
         * atFirst("hi") → "hi"
         * atFirst("h") → "h@"
         */
    }

    public String atFirst(String str) {
        return (str == "")?"@@":(str.length() < 2) ? str + "@" : (str.length() == 2) ? str : str.substring(0, 2);
    }

}
