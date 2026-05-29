class Solution {
    public int minElement(int[] nums) {
        int sum = 0;int min = Integer.MAX_VALUE;
        for(int i:nums){
            sum=0;
            while(i>0){
                sum+=i%10;
                i/=10;
            }
            min = Math.min(sum, min);
        }
        return min;
    }
}