class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[]bool = new boolean[101];
        List<Integer>list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int ele:nums){
            min = Math.min(ele, min);
            max = Math.max(ele, max);
            bool[ele] = true;
        }
        for(int i = min;i<=max;i++){
            if(!bool[i])list.add(i);
        }
        return list;
    }
}