package hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        // Base case: for different length of two strings...
        if(s.length() != t.length())
            return false;
        // Create two maps for s & t strings...
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        // Traverse all elements through the loop...
        for(int idx = 0; idx < s.length(); idx++){
            // Compare the maps, if not equal, return false...
            if(map1[s.charAt(idx)] != map2[t.charAt(idx)])
                return false;
            // Insert each character if string s and t into seperate map...
            map1[s.charAt(idx)] = idx + 1;
            map2[t.charAt(idx)] = idx + 1;
        }
        return true;    // Otherwise return true..
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        String s2 = "foo";
        String t2 = "bar";
        String s3 = "paper";
        String t3 = "title";
        String s4 = "badc";
        String t4 = "baba";

        System.out.println(isIsomorphic(s1, t1));
        System.out.println(isIsomorphic(s2, t2));
        System.out.println(isIsomorphic(s3, t3));
        System.out.println(isIsomorphic(s4, t4));
    }
}
