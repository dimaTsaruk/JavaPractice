package codingBat.Strings;

public class withoutX {
    public static void main(String[] args) {
        /**
         *
         Given a string, if the first or last chars are 'x',
         return the string without those 'x' chars, and otherwise return the string unchanged.

         withoutX("xHix") → "Hi"
         withoutX("xHi") → "Hi"
         withoutX("Hxix") → "Hxi"
         */
    }

    public String withoutX(String str) {

        String s = str;
        if (str.length() < 2)
            s = "";
        if (str.startsWith("x") && s.endsWith("x"))
            s = str.substring(1, str.length() - 1);
        else if (str.startsWith("x"))
            s = str.substring(1);
        else if (str.endsWith("x"))
            s = str.substring(0, str.length() - 1);
        return s;
    }

}
