class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] freq = new int[26];
        // Count characters of s1
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        int left = 0;
        int right = 0;
        int required = s1.length();
        while (right < s2.length()) {
            char ch = s2.charAt(right);
            // If this character is useful, reduce required count
            if (freq[ch - 'a'] > 0) {
                required--;
            }
            // Decrease frequency (even if negative)
            freq[ch - 'a']--;
            right++;
            // When window size equals s1 length
            if (right - left == s1.length()) {
                // If all characters matched
                if (required == 0) {
                    return true;
                }
                // Remove left character from window
                char leftChar = s2.charAt(left);
                if (freq[leftChar - 'a'] >= 0) {
                    required++;
                }
                freq[leftChar - 'a']++;
                left++;
            }
        }
        return false;
    }
}
