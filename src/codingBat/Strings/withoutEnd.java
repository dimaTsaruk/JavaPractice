package codingBat.Strings;

public class withoutEnd {
    public static void main(String[] args) {
        /**
         * Given a string, return a version without the first and last char,
         * so "Hello" yields "ell". The string length will be at least 2.
         *
         * withoutEnd("Hello") → "ell"
         * withoutEnd("java") → "av"
         * withoutEnd("coding") → "odin"
         */
    }

    public String withoutEnd(String str) {

        return (str.length() >= 2) ? str.substring(1, str.length() - 1) : "-1";
    }
}
