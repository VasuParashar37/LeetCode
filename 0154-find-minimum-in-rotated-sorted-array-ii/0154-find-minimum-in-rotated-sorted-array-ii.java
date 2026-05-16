class Solution {
    public int findMin(int[] nums) {
        int n = nums.length-1;
        int last = nums[n];
        int start = 0;
        int end = n;
        while(start<end && nums[start]==nums[end])start++;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>last){
                start = mid+1;
            }else end = mid;
        }
        return nums[start];
    }
}