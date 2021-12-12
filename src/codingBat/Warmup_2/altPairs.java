package codingBat.Warmup_2;

public class altPairs {
    // 2,3 6,7, 10,11

    /**
     * Given a string, return a string made
     * of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     * <p>
     * altPairs("kitten") → "kien"
     * altPairs("Chocolate") → "Chole"
     * altPairs("CodingHorror") → "Congrr"
     */
    public static void main(String[] args) {
        System.out.println(altPairs("Chocolate"));
    }

    public static String altPairs(String str) {

        if (str.length() <= 1) return str;
        String s = "";
        for (int i = 0; i < str.length() - 1; i += 4) {
            s += str.charAt(i) + str.charAt(i + 1);
        }
        return s;
    }

}
