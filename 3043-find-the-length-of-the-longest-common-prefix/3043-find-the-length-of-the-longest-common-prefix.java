class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer>set = new HashSet<>();int maxLength = 0;
        for(int ele:arr1){
            while(ele>0){
                if(!set.contains(ele))set.add(ele);
                ele/=10;
            }
        }
        for(int ele:arr2){
            while(ele!=0){
                if(set.contains(ele))
                    maxLength = Math.max(Integer.toString(ele).length(),maxLength);
                ele = ele/10;
            }
        }
        return maxLength;
    }
}