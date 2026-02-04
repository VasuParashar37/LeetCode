class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();
        if(nums1.length<nums2.length){
            set = addInSet(nums1);
            set2 = checkElement(nums2, set);
        } 
        else{
            set = addInSet(nums2);
            set2 = checkElement(nums1, set);
        } 
        int[]arr=new int[set2.size()];
        int i=0;
        for(Integer s:set2){
            arr[i]=s;
            i++;
        }
        return arr;
    }
    public HashSet<Integer> checkElement(int[]arr, HashSet<Integer>set){
        HashSet<Integer>set2 = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]))set2.add(arr[i]);
        }
        return set2;
    }
    public HashSet<Integer> addInSet(int[]arr){
        HashSet<Integer>set=new HashSet<>();
        int i=0;
        while(i<arr.length){
            set.add(arr[i]);
            i++;
        }
        return set;
    }
}