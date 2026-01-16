class Solution {
    public int findNumbers(int[] nums) {
        // Brute-Force Solution---------------------
        // int evenNumber = 0;
        // for(int i=0;i<nums.length;i++){
        //     int countDigits=0;
        //     while(nums[i]>0){
        //         nums[i] = nums[i]/10;
        //         countDigits++;
        //     }
        //     if(countDigits%2==0)
        //         evenNumber++;
        // }
        // return evenNumber;

        //optimal
        // int evenCount = 0;
        // for(int i=0;i<nums.length;i++){
        //     String num = Integer.toString(nums[i]);
        //     if(num.length()%2==0)evenCount++;
        // }
        // return evenCount;

        //logbase10
        int evenCount = 0;
         for(int i=0;i<nums.length;i++){
            int digits = (int)(Math.log10(nums[i]))+1;
            if(digits%2==0)evenCount++;
        }
        return evenCount;
    }
}