class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int ele:nums){
            if(ele>max) max = ele;
            if(ele<min) min = ele;
        }
        boolean flag = false;
        int j = min;
        while(j<=max){
            flag = false;
            for(int i=0;i<nums.length;i++){
                if(j==nums[i]){
                    flag = true;
                }
            }
            if(!flag)list.add(j);
            j++;
        }
        return list;
    }
}