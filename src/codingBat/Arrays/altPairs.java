package codingBat.Arrays;

public class altPairs {
    /*
    Given a string, return a string made of
    the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
     */


    public static void main(String[] args) {
        System.out.println(altPairs1("kitten"));
        System.out.println(altPairs2("kitten"));
    }

    public static String altPairs1(String str) {
        String result = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i = 0; i < str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }

    public static String altPairs2(String str) {
        char[] array = str.toCharArray();
        String line = "";

        if (str.length() == 1) {
            return str;
        } else
            for (int i = 0; i < array.length - 1; i += 4) {
                line += String.valueOf("" + array[i] + array[i + 1]);
            }
        return line;
    }

}
