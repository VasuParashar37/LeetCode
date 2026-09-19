class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
        }
        return (nums.length*(nums.length+1))/2 - sum;
    }
}