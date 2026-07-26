class Solution {
    public int maximumProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i:nums){
            if(i>largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = i;
            }
            else if(i>secondLargest){
                thirdLargest = secondLargest;
                secondLargest = i;
            }
            else if(i > thirdLargest) thirdLargest = i;

            if(i<smallest){
                secondSmallest = smallest;
                smallest = i;
            }else if(i<secondSmallest){
                secondSmallest = i;
            }
        }
        return Math.max(smallest*secondSmallest*largest, largest*secondLargest*thirdLargest);
    }
}