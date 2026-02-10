class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set = new HashSet<>();
        int n=s.length(); int length = 0;int max = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            set = new HashSet<>();
            for(int j=i;j<n;j++){
                char chr = s.charAt(j);
                if(!set.contains(chr)){
                    set.add(chr);
                    length = j-i+1;
                }else break;
            }
            max = Math.max(length, max);
        }
        return max;
    }
}