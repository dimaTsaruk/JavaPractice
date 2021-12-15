package codingBat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
    /**
     * Given an array of non-empty strings,
     * return a Map<String, String> with a key for every different first character seen,
     * with the value of all the strings starting with that character appended
     * together in the order they appear in the array.
     * <p>
     * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
     * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
     * firstChar([]) → {}
     */

    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<>();
        String s = "";
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].charAt(0) == strings[j].charAt(0)) {
                    if (!map.containsKey(strings[i]))
                        map.put("" + strings[i].charAt(0), s.concat(strings[j]));
                }
            }
        }
        return map;
    }

}
