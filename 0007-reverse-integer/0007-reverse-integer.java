class Solution {
    public int reverse(int x) {
        long s=0;
        int n=x;
        while(x !=0){
            int rem=x%10;
            s=(s*10)+rem;
            x=x/10;
        }
        if(s>Integer.MAX_VALUE || s<Integer.MIN_VALUE)
            return 0;
        return (int)s;

    }
}