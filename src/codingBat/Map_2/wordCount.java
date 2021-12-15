package codingBat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
    /**
     * The classic word-count algorithm: given an array of strings,
     * return a Map<String, Integer> with a key for each different string,
     * with the value the number of times that string appears in the array.
     * <p>
     * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
     * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
     * wordCount(["c", "c", "c", "c"]) → {"c": 4}
     */

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i]))
                map.put(strings[i], 1);
            else {
                int strCount = map.get(strings[i]);
                map.put(strings[i], strCount + 1);
            }
        }
        return map;

    }

}
