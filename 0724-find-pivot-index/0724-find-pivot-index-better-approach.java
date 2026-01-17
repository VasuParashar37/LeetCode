class Solution {
    public int pivotIndex(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1)
                rightSum = arr[arr.length-1] - arr[i];
            if(i!=0)
                leftSum = arr[i-1];
            if(i==arr.length-1) rightSum = 0;
            if(i==0) leftSum = 0;
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}