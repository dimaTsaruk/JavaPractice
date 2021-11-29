package codingBat.Strings;

public class frontAgain {
    public static void main(String[] args) {
        /**
         *
         Given a string, return true if the first 2 chars in the string
         also appear at the end of the string, such as with "edited".

         frontAgain("edited") → true
         frontAgain("edit") → false
         frontAgain("ed") → true
         */
    }

    public boolean frontAgain(String str) {
        boolean b = false;
        if (str.length() < 2)
            return b;
        else if (str.length() == 2 || str.substring(0, 2).equals(str.substring(str.length() - 2)))
            b = true;
        return b;
    }

}
