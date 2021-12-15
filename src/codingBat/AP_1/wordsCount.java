package codingBat.AP_1;

public class wordsCount {
    /**
     * Given an array of strings,
     * return the count of the number of strings with the given length.
     * <p>
     * <p>
     * wordsCount(["a", "bb", "b", "ccc"], 1) → 2
     * wordsCount(["a", "bb", "b", "ccc"], 3) → 1
     * wordsCount(["a", "bb", "b", "ccc"], 4) → 0
     */

    public int wordsCount(String[] words, int len) {

        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len)
                counter++;
        }
        return counter;
    }

}
