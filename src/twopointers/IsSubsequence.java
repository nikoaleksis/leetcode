package twopointers;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int currentS = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(currentS)) {
                currentS++;
                if (currentS == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";

        String s2 = "axc";
        String t2 = "ahbgdc";

        String s3 = "b";
        String t3 = "abc";

        isSubsequence(s1, t1);
        isSubsequence(s2, t2);
        isSubsequence(s3, t3);

    }
}
