class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        for(int i:nums){
            if(i<pivot)
                list1.add(i);
            else if(i>pivot)
                list2.add(i);
        }
        int equal = nums.length - (list1.size() + list2.size());
        int i=0;
        while(i<list1.size()){
            nums[i]=list1.get(i);
            i++;
        }
        while(equal-->0){
            nums[i]=pivot;
            i++;
        }
        int j=0;
        while(j<list2.size()){
            nums[i]=list2.get(j);
            i++;
            j++;
        }
        return nums;
    }
}