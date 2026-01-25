class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = Integer.MIN_VALUE; int length = 0;int i=0;
        Set<Character>set = new HashSet<>();
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
            }
            else {
                while(set.contains(ch)){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(ch);
            }
            maxLength = Math.max(j - i + 1, maxLength);
        }
        return Math.max(length, maxLength);
    }
}