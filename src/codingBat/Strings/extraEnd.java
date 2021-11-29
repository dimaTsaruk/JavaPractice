package codingBat.Strings;

public class extraEnd {
    /*
    Given a string, return a new string made of 3
    copies of the last 2 chars of the original string.
    The string length will be at least 2.

    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
     */


    public static void main(String[] args) {
        System.out.println(extraEnd("ab"));
    }

    public static String extraEnd(String str) {
        String last2chars = str.substring(str.length() - 2);
        return (last2chars + last2chars + last2chars);
    }

}
