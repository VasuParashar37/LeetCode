class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> mpp = new HashMap<>();

        int i = 0, j = 0;
        int maxFreq = 0;
        int maxLen = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, mpp.get(ch));

            while ((j - i + 1) - maxFreq > k) {
                char leftChar = s.charAt(i);
                mpp.put(leftChar, mpp.get(leftChar) - 1);
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }

        return maxLen;
    }
}