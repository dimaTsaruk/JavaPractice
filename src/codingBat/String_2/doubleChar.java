package codingBat.String_2;

public class doubleChar {
    /**
     * Given a string, return a string where for every char in the original,
     * there are two chars.
     * <p>
     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public String doubleChar(String str) {
        String sd = "";
        for (int i = 0; i < str.length(); i++)
            sd = sd + str.charAt(i) + str.charAt(i);
        return sd;
    }

}
