class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int i=0;
        double maxSum = Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(j-i+1==k){
                maxSum = Math.max(sum, maxSum);
                sum-=nums[i];
                i++;
            }
        }
        return maxSum/k;
    }
}