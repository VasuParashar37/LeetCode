class Solution {
    public boolean isPalindrome(String s) {
        int i=0;int j=s.length()-1;
        s = s.toLowerCase();
        while(i<j){
            char ch = s.charAt(i);
            char chr = s.charAt(j);
            while(i<j && !Character.isLetterOrDigit(ch)){
                i++;
                ch = s.charAt(i);
            }
            while(i<j && !Character.isLetterOrDigit(chr)){
                j--;
                chr = s.charAt(j);
            }
            if(ch == chr){
                i++;j--;
            }
            else return false;
        }
        return true;
    }
}
// a man, a plan, a canal: panama