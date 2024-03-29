package twopointers;

import java.util.Arrays;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Find the next alphanumeric character from the left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Find the next alphanumeric character from the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // Move pointers towards the center
            left++;
            right--;
        }

        return true;

    }


    public static void main(String[] args) {
        String case1 = "A man, a plan, a canal: Panama";
        String case2 = "race a car";
        String case3 = " ";

        isPalindrome(case1);
        isPalindrome(case2);
        isPalindrome(case3);
    }
}
