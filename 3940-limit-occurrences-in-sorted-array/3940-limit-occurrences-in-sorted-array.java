class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer, Integer>map=new LinkedHashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        int count = 0;
        Iterator<Map.Entry<Integer, Integer>>it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, Integer>entry=it.next();
            int key = entry.getKey();
            int value = entry.getValue();
            count=0;
            for(int i=0;i<value;i++){
                list.add(entry.getKey());
                count++;
                if(count==k){
                    it.remove();
                    break;
                }
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