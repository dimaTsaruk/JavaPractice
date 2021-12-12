package codingBat.Warmup_2;

public class stringBits {
    /**
     * Given a string, return a new string made of every other
     * char starting with the first, so "Hello" yields "Hlo".
     * <p>
     * stringBits("Hello") → "Hlo"
     * stringBits("Hi") → "H"
     * stringBits("Heeololeo") → "Hello"
     */
    public static void main(String[] args) {
        System.out.println(stringBits("Heeololeo"));
    }

    public static String stringBits(String str) {

     /*   String result = "";
        // Note: the loop increments i by 2
        for (int i=0; i<str.length(); i+=2) {
            result = result + str.substring(i, i+1);
            // Alternately could use str.charAt(i)
        }
        return result;*/

        String result = "";
        for (int i = 0; i < str.length() ; i += 2)
            result = result + str.charAt(i);
        return result;

    }
}
