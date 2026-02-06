class Solution {
    public boolean isAnagram(String s, String t) {
//Using a HashMap gives O(n) time but O(k) space, while a frequency array leverages the fixed lowercase alphabet to achieve true O(1) space with lower constant overhead, making it more optimal under these constraints.

        int[]freq=new int[26];
        for(char ch:s.toCharArray()) freq[ch-'a']++;
        
        for(char ch:t.toCharArray()) freq[ch-'a']--;

        for(int i:freq) if(i!=0)return false;
        return true;
    }
}