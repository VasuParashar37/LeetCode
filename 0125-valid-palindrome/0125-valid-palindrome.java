class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        int i=0;
        while(i<s.length()/2){
            if(s.charAt(i)!=(s.charAt(s.length()-1-i))) return false;
            i++;
        }
        return true;
    }
}