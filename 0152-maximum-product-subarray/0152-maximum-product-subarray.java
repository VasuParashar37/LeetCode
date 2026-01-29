class Solution {
    public int maxProduct(int[] nums) {
        int currentProduct = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currentProduct = Math.max(nums[i], currentProduct * nums[i]);
            maxProduct = Math.max(currentProduct, maxProduct);
        }
        return maxProduct;
    }
}