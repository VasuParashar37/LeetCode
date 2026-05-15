class Solution {
    public int findMin(int[] nums) {
        int start = 0; int end = nums.length-1;int mid=-1;
        while(start<=end){
            mid = start+(end - start)/2;
            if(nums[start]<=nums[end])return nums[start];
            if(mid<end && nums[mid]>nums[mid+1] ){
                return nums[mid+1];
            }else if(nums[mid]<nums[mid-1])return nums[mid];
            else if(nums[mid]>nums[end])start = mid+1;
            else end = mid-1;
        }
        return nums[mid];
    }
}
// [3,1,2]