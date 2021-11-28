package codingBat.Strings;

public class stringBits {
    /*
    Given a string, return a new string made of
    every other char starting with the first, so "Hello" yields "Hlo".
        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"
     */

    public static void main(String[] args) {
        System.out.print(stringBits(""));

    }

    public static String stringBits(String str) {
        String result = "";
        if(str.equals("")) return "";
        if (str.length() <= 2)
        result = String.valueOf(str.charAt(0));
        else
            for (int i = 0; i < str.length(); i += 2)
                result += String.valueOf(str.charAt(i));
        return result;
    }
}
