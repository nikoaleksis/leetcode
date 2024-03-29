package arraysandstrings;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int amountOfDuplicates = 0;

        for (int i = 1, j = 0; i < nums.length; i++) {
            int lastElement = nums[i - 1];
            int currentElement = nums[i];

            if (currentElement != lastElement) {
                j = j + 1;
            } else {
                amountOfDuplicates++;
            }

            if (j < nums.length) {
                nums[j] = nums[i];
            }
        }

        return nums.length - amountOfDuplicates;
    }

    public static void main(String[] args) {
        int[] firstCase = { 1, 1, 2 };
        int[] secondCase = { 0,0,1,1,1,2,2,3,3,4 };

        int first = removeDuplicates(firstCase);
        int second = removeDuplicates(secondCase);

        System.out.println("Amount of duplicates " + first + " and " + second);
    }
}
