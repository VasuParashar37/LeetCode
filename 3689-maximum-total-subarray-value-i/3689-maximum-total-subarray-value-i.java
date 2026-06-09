class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(int i:nums){
            if(i<min)min = i;
            if(i>max)max = i;
        }
        return (max-min)*k;
    }
}