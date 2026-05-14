class Solution {
    public boolean isGood(int[] nums) {
        int max=Integer.MIN_VALUE;int count=0;
        Map<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i], max);
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i])>1)count++;
        }
        if(nums.length==max+1 && map.get(max)==2 && count==1)return true;
        else return false;
    }
}