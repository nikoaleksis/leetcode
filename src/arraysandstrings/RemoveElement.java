package arraysandstrings;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // If the current element is not the one to remove, place it at the jth position
                nums[j] = nums[i];
                j++; // Move j to the next position
            }
        }

        return j;
    }
    public static void main(String[] args) {

        int[] nums2 = { 0,0,1,1,1,1,2,3,3 };
        int val2 = 2;

        System.out.println(removeElement(nums2, val2));

    }
}
