class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq = new int[26];
        int[] freqP = new int[26];
        for (int i = 0; i < p.length(); i++)
            freqP[p.charAt(i) - 'a']++;
        List<Integer>list = new ArrayList<>();
        int right = 0;
        int left = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            freq[ch - 'a']++;
            if (right - left + 1 == p.length()) {
                if (Arrays.equals(freqP, freq))
                    list.add(left);
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return list;
    }
}