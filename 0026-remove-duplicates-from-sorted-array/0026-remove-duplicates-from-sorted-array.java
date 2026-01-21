class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>set=new LinkedHashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int j=0;
        for(Integer i:set){
            nums[j] = i;
            j++;
        }
        return set.size();
    }
}