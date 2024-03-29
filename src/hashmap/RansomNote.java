package hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.equals(magazine)) {
            return true;
        }

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> availabilityOfLetters = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            Integer count = availabilityOfLetters.getOrDefault(c, 0);
            availabilityOfLetters.put(c, ++count);
        }

        for (char c : ransomNote.toCharArray()) {
            Integer count = availabilityOfLetters.get(c);

            if (count == null || count == 0) {
                return false;
            }

            availabilityOfLetters.put(c, --count);
        }
        
        return true;
    }

    public static void main(String[] args) {
        String rn1 = "a";
        String m1 = "b";
        String rn2 = "aa";
        String m2 = "ab";
        String rn3 = "aa";
        String m3 = "aab";

        canConstruct(rn1, m1);
        canConstruct(rn2, m2);
        canConstruct(rn3, m3);
    }
}
