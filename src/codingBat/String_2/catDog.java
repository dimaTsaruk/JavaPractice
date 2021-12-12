package codingBat.String_2;

public class catDog {
    /**
     * Return true if the string "cat" and "dog"
     * appear the same number of times in the given string.
     * <p>
     * catDog("catdog") → true
     * catDog("catcat") → false
     * catDog("1cat1cadodog") → true
     */
    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        if(str.equals("cat") || str.equals("dog")) return false;

        if (str.length() >= 6) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't')
                    catCount++;
                if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g')
                    dogCount++;
            }
            return (catCount == dogCount);
        } else return true;


    }

}
