class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i,j; i = j = 0;
        List<Integer>list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(list.size()==0)list.add(nums1[i]);
                if(list.get(list.size()-1)!=nums1[i])
                    list.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        System.out.print(list);
        int[]arr = new int[list.size()];
        int k=0;
        for(Integer l:list){
            arr[k] = l;
            k++;
        }
        return arr;
    }
}