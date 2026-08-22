class Solution {
    public boolean isSubsequence(String s, String t) {
        int lastFoundIndex = -1;
        for(int i=0;i<s.length();i++){
            boolean isPresent = false;
            for(int j=lastFoundIndex+1;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    if(j<lastFoundIndex)
                        return false;
                    lastFoundIndex = j;
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent)return false;
        }
        return true;
    }
}