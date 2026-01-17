class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum = calculateSum(nums, 0, i - 1);
            rightSum = calculateSum(nums, i + 1, nums.length - 1);
            System.out.println(leftSum);
            System.out.println(rightSum);
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }

    public int calculateSum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}