package arraysandstrings;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int votes = 0;
        int candidate = -1;

        for (int i = 0; i < nums.length; i++) {

            if (votes == 0) {
                candidate = nums[i];
                votes++;
                continue;
            }

            if (nums[i] == candidate) {
                votes++;
                continue;
            }
            votes--;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            };

            if (count > nums.length / 2) {
                return candidate;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] case1 = { 3,2,3 };
        int[] case2 = { 2,2,1,1,1,2,2 };

        majorityElement(case1);
        majorityElement(case2);
    }
}
