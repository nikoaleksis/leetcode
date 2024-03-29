package twopointers;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int leftIndex = 0, rightIndex = numbers.length - 1;

        while (leftIndex != rightIndex) {
            int sum = numbers[leftIndex] + numbers[rightIndex];

            if (sum == target) {
                return new int[]{leftIndex + 1, rightIndex + 1};
            }

            if (sum < target) {
                leftIndex++;
                continue;
            }

            rightIndex--;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] n1 = {2,7,11,15};
        int t1 = 9;
        int[] n2 = {2,3,4};
        int t2 = 6;
        int[] n3 = {-1,0};
        int t3 = -1;
        int[] n4 = {5,25,75};
        int t4 = 100;

//        twoSum(n1, t1);
//        twoSum(n2, t2);
//        twoSum(n3, t3);
        twoSum(n4, t4);
    }
}
