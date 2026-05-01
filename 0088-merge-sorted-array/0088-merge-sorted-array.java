class Solution {
    void swap(int[] nums1,int[] nums2,int i1,int i2){
        if(nums1[i1]>nums2[i2]){
            int temp=nums1[i1];
            nums1[i1]=nums2[i2];
            nums2[i2]=temp;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=m+n;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=gap+left;
            while(right<len){
                if(left<m && right>=m)
                    swap(nums1, nums2,left,right-m);
                else if(left>=m)
                    swap(nums2, nums2,left-m,right-m);
                else 
                    swap(nums1, nums1,left,right);
                left++;
                right++;
            }
                if(gap==1)break;
                gap=(gap/2)+(gap%2);
        }
        for(int i=0;i<nums2.length;i++){
            nums1[m]=nums2[i];
            m++;
        }
    }
}