class Solution {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return solve(0, nums, dp);
    }

    private int solve(int index, int[] nums, int[] dp) {

        // Base case
        if (index >= nums.length) {
            return 0;
        }

        // Already computed
        if (dp[index] != -1) {
            return dp[index];
        }

        // Choice 1: Rob current house
        int take = nums[index] + solve(index + 2, nums, dp);

        // Choice 2: Skip current house
        int skip = solve(index + 1, nums, dp);

        // Store and return answer
        dp[index] = Math.max(take, skip);

        return dp[index];
    }
}