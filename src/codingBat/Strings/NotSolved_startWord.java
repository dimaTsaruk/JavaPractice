package codingBat.Strings;

public class NotSolved_startWord {
    public static void main(String[] args) {
        /**
         * Given a string and a second "word" string, we'll say that the word matches
         * the string if it appears at the front of the string, except its first char
         * does not need to match exactly. On a match, return the front of the string,
         * or otherwise return the empty string. So, so with the string "hippo" the word "hi"
         * returns "hi" and "xip" returns "hip". The word will be at least length 1.
         *
         * NotSolved_startWord("hippo", "hi") → "hi"
         * NotSolved_startWord("hippo", "xip") → "hip"
         * NotSolved_startWord("hippo", "i") → "h"
         */
    }


    /*public String NotSolved_startWord(String str, String word) {
        if(str.startsWith(word) || str.startsWith(word.substring(1)))
            return word;
        return "";

    }*/
}
