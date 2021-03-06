package codingBat.Strings;

public class withoutX2 {
    public static void main(String[] args) {
        /**
         * Given a string, if one or both of the first 2 chars is 'x',
         * return the string without those 'x' chars, and otherwise return the string unchanged.
         * This is a little harder than it looks.
         *
         * withoutX2("xHi") → "Hi"
         * withoutX2("Hxi") → "Hi"
         * withoutX2("Hi") → "Hi"
         */
    }

    public String withoutX2(String str) {

        return (str.length() <2)?"":(str.charAt(0) == 'x' || str.charAt(1) == 'x') ?
                str.substring(0, 2).replace("x", "") + str.substring(2) : str;

    }

}
