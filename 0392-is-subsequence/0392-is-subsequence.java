class Solution {
    public boolean isSubsequence(String s, String t) {
        return recurse(0, 0, s, t);
    }

    private boolean recurse(int i, int j, String s, String t) {
        if (i == s.length())
            return true;
        if (j == t.length())
            return false;
        if (s.charAt(i) == t.charAt(j))
            i++;
        j++;
        return recurse(i, j, s, t);
    }
}