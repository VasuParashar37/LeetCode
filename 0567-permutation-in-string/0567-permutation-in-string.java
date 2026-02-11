class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;
        for (int i = 0; i <= m - n; i++) {
            // Get substring of length n
            String sub = s2.substring(i, i + n);
            if (isPermutation(s1, sub)) {
                return true;
            }
        }
        return false;
    }
    private boolean isPermutation(String a, String b) {
        int[] freq = new int[26];
        for (char c : a.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            freq[c - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }
}
