class Solution {
    public int numberOfSpecialChars(String word) {
        int n = 26;
        int[] small = new int[n];  // last occurrence of lowercase
        int[] big = new int[n];    // first occurrence of uppercase
        
        Arrays.fill(small, -1);
        Arrays.fill(big, word.length());
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            if (Character.isLowerCase(ch)) {
                int idx = ch - 'a';
                small[idx] = i;                    // update last position
            } else {
                int idx = ch - 'A';
                if (big[idx] == word.length()) {   // only record first occurrence
                    big[idx] = i;
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (small[i] != -1 && big[i] != word.length()) {
                if (small[i] < big[i]) {
                    count++;
                }
            }
        }
        
        return count;
    }
}