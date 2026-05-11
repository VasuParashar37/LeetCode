class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>list = new ArrayList<>();
        Stack<Integer>st;
        for(int num:nums){
            st = new Stack<>();
            while(num!=0){
                int rem = num%10;
                st.push(rem);
                num = num/10;
            }
            while(!st.isEmpty())list.add(st.pop());
        }
        int[]arr=new int[list.size()];
        int i=0;
        for(Integer ele:list){
            arr[i]=ele;
            i++;
        }
        return arr;
    }
}