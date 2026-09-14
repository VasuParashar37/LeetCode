class Solution {
    public int maxProduct(int[] nums) {
        int suffix = 1; int prefix = 1; int currentAnswer = Integer.MIN_VALUE; 
        int finalAnswer  = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            prefix*=nums[i];
            suffix*=nums[nums.length - i - 1];
            currentAnswer = Math.max(prefix, suffix);
            finalAnswer = Math.max(currentAnswer, finalAnswer);
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
        }
        return finalAnswer;
    }
}