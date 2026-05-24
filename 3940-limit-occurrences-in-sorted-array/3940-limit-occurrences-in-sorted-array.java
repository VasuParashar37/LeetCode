class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer, Integer>map=new LinkedHashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i)<=k){
                list.add(i);
            }
        }
        int[]arr=new int[list.size()];
        int j=0;
        for(int i:list){
            arr[j]=i;
            j++;
        }
        return arr;
    }
}