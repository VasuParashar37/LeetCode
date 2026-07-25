class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        solve(0, cost, dp);
        return Math.min(dp[0], dp[1]);
    }

    private static int solve(int idx, int[] cost, int[] dp) {
        if (idx >= cost.length) {
            return 0;
        }
        if(dp[idx]!=-1)
            return dp[idx];
        int firstStep = cost[idx] + solve(idx + 1, cost, dp);
        int secondStep = cost[idx] + solve(idx + 2, cost, dp);
        dp[idx] = Math.min(firstStep, secondStep);
        return dp[idx];
    }
}