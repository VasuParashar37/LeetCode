class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;int sum=0;int max=nums[0];int count=0;
        Map<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i], max);
            sum+=nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i])>1)count++;
        }
        if(n==max+1 && map.get(max)==2 && count==1)return true;
        else return false;
    }
}