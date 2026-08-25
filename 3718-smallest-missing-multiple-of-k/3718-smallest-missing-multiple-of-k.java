class Solution {
    public int missingMultiple(int[] nums, int k) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        boolean[]b = new boolean[max + k + 1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                b[nums[i]]=true;
            }
        }
        System.out.println(Arrays.toString(b));
        for(int i=1;i<b.length;i++){
            if(i%k==0 && b[i]==false)return i;
        }
        return -1;
    }
}