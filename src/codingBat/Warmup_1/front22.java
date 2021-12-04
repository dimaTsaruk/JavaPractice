package codingBat.Warmup_1;

public class front22 {
    public static void main(String[] args) {
        /**
         *
         Given a string, take the first 2 chars and return the string with the 2 chars
         added at both the front and back, so "kitten" yields"kikittenki".
         If the string length is less than 2, use whatever chars are there.

         front22("kitten") → "kikittenki"
         front22("Ha") → "HaHaHa"
         front22("abc") → "ababcab"
         */
    }

    public String front22(String str) {

        if (!(str.length() < 2)) {
            String sub = str.substring(0, 2);
            return sub + str + sub;
        }
        return str + str + str;


    }
}
