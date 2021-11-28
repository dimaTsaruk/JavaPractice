package codingBat.Strings;

public class setColor {
    public static void main(String[] args) {
        /**
         *
         Given a string, if the string begins with "red" or "blue"
         return that color string, otherwise return the empty string.

         seeColor("redxx") → "red"
         seeColor("xxred") → ""
         seeColor("blueTimes") → "blue"
         */
    }

    public String seeColor(String str) {
        String s = "";
        if (str.startsWith("blue"))
            s = "blue";
        else if (str.startsWith("red"))
            s = "red";
        return s;

    }
}
