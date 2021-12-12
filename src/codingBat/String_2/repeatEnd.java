package codingBat.String_2;

public class repeatEnd {
    /**
     * Given a string and an int n,
     * return a string made of n repetitions of the
     * last n characters of the string. You may assume that
     * n is between 0 and the length of the string, inclusive.
     * <p>
     * repeatEnd("Hello", 3) → "llollollo"
     * repeatEnd("Hello", 2) → "lolo"
     * repeatEnd("Hello", 1) → "o"
     */

    public static void main(String[] args) {
        String s = "ABCDE";
        int numOfChars = 2;
        String chars = s.substring(s.length() - numOfChars);
        System.out.println(chars);
    }

    public String repeatEnd(String str, int n) {

        String s = str.substring(str.length() - n);
        String result = "";
        for (int i = 0; i < n; i++)
            result += s;
        return result;
    }


}
