class Solution {
    public int longestConsecutive(int[] nums) {
        int c = 1;int maxLength = 0;
        if(nums.length==0)return 0;
        if(nums.length==1)return 1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            while(i<nums.length && nums[i]==nums[i-1]){
                i++;
            }
            if(i<nums.length && nums[i-1]+1==nums[i]){
                c++;
                maxLength = Math.max(c, maxLength);
            }
            else c=1;
            System.out.println(maxLength);
        }
        return Math.max(c, maxLength);
    }
}