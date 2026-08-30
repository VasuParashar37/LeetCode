class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1)return 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minInd = -1;
        int maxInd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minInd = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxInd = i;
            }
        }
        int minDelFromFront = Math.max(minInd, maxInd) + 1;
        int minDelFromBack = nums.length - Math.min(minInd, maxInd);
        int minDelFromBoth = (nums.length - minDelFromBack + 1) + (nums.length - minDelFromFront + 1);
        int mini = Math.min(minDelFromFront, minDelFromBack);
        return Math.min(mini, minDelFromBoth);
    }
}