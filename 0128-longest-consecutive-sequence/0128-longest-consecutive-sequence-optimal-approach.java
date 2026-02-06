class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int startSequence = 0;int length;int maxLength = 0;
        for(int i:set){
            if(!set.contains(i-1)){
                startSequence = i;
                length = 1;
                while(set.contains(startSequence+1)){
                    length++;
                    startSequence = startSequence+1;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}