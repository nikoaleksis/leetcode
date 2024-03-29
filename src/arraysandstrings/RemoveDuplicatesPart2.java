package arraysandstrings;

public class RemoveDuplicatesPart2 {
    public static int removeDuplicates(int[] nums) {
        int occurances = 1; // Theres always at least 1 occurance
        int nextUniqueIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            int previous = nums[i - 1];
            int current = nums[i];

            occurances++;

            if (previous != current) {
                occurances = 1;
            }

            if (occurances < 3) {
                nums[nextUniqueIndex++] = nums[i];
            }
        }

        return nextUniqueIndex;
    }

    public static void main(String[] args) {
        int[] firstCase = { 1,1,1,2,2,3 };
        int[] secondCase = { 0,0,1,1,1,1,2,3,3 };

        int first = removeDuplicates(firstCase);
        int second = removeDuplicates(secondCase);

        //System.out.println("Amount of duplicates " + first + " and " + second);
    }
}
