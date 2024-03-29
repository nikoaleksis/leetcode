package hashmap;

import java.util.Arrays;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        String[] charToWord = new String[26]; // Assuming only lowercase letters
        String[] wordToChar = new String[words.length];

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            int index = currentChar - 'a'; // Mapping characters to array indices

            if (charToWord[index] == null) {
                // If the character is not mapped yet, check if the word is already mapped
                if (wordToChar[i] != null && !wordToChar[i].equals(String.valueOf(currentChar))) {
                    return false; // Word is already mapped to a different character
                }
                charToWord[index] = words[i];
                wordToChar[i] = String.valueOf(currentChar);
            } else {
                // If the character is already mapped, check if it is mapped to the current word
                if (!charToWord[index].equals(words[i])) {
                    return false; // Character is mapped to a different word
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        String pattern4 = "abba";
        String s4 = "dog dog dog dog";

 //       wordPattern(pattern1, s1);
//        wordPattern(pattern2, s2);
//        wordPattern(pattern3, s3);
        wordPattern(pattern4, s4);
    }
}
