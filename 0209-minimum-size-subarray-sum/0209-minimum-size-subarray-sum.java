class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j = 0;
        int i = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int length = 0;
        int n = nums.length;
        while (j < n) {
            if (sum < target) {
                sum += nums[j];
            } if(sum>=target) {
                while (sum >= target) {
                    length = j - i + 1;
                    minLength = Math.min(length, minLength);
                    sum -= nums[i];
                    i++;
                }
            }
            j++;
        }
        return Math.min(length, minLength);
    }
}