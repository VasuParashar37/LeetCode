class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Set<List<Integer>>listSet=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer>set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int lastElement=-(nums[i]+nums[j]);
                if(set.contains(lastElement)){
                    List<Integer>list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(lastElement);
                    Collections.sort(list);
                    listSet.add(list);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(listSet);
    }
}