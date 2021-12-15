package devxSchool.fall2020.map;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class charCounter {

    public static void main(String[] args) {

        System.out.println(charCounter("chicago bullsa"));

    }

     static Map<Character, Integer> charCounter(String word) {

        Map<Character, Integer> register = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!register.containsKey(word.charAt(i))) {
                register.put(word.charAt(i), 1);
            } else {
                int numOfChar = register.get(word.charAt(i));
                register.put(word.charAt(i), numOfChar + 1);
            }
        }
        return register;
    }
}
