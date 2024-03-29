package arraysandstrings;

import java.util.Arrays;

public class MergeArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int commonPointer = m + n - 1;

        while (p2 >= 0) {
            int number1 = p1 >= 0 ? nums1[p1] : Integer.MIN_VALUE;
            int number2 = p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;

            if (number1 > number2) {
                nums1[commonPointer--] = nums1[p1--];
            } else {
                nums1[commonPointer--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
