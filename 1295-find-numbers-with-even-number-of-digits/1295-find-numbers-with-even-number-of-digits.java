class Solution {
    public int findNumbers(int[] nums) {
        int evenNumber = 0;
        for(int i=0;i<nums.length;i++){
            int countDigits=0;
            while(nums[i]>0){
                nums[i] = nums[i]/10;
                countDigits++;
            }
            if(countDigits%2==0)
                evenNumber++;
        }
        return evenNumber;
    }
}