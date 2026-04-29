class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int a=0;int b=s.length()-1;
        while(a<s.length()/2){
            if(!(s.charAt(a)==s.charAt(b))){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}