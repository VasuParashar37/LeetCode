class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum=0;
                continue;
            }
            sum+=nums[i];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}