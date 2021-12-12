package codingBat.String_2;

public class countHi {
    /**
     * Return the number of times that the string "hi" appears anywhere in the given string.
     * <p>
     * countHi("abc hi ho") → 1
     * countHi("ABChi hi") → 2
     * countHi("hihi") → 2
     */

    public int countHi(String str) {
        String s = "";
        int count = 0;

        if (str.length() < 2) return 0;
        else

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
                    count++;

            }
        return count;

    }

}
