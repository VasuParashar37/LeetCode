class Solution {
    public char findTheDifference(String s, String t) {
        int xors=0;
        for(char ch:s.toCharArray())xors^=ch;
        for(char ch:t.toCharArray())xors^=ch;
        return (char)(xors);
    }
}