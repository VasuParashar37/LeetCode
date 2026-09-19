class Solution {
    public int[] countBits(int n) {
        int[]arr = new int[n+1];
        for(int i = 1; i <= n; i++){
            int count = 0;
            int m = i;
            while(m>0){
                m = m&(m-1);
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}