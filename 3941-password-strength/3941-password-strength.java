class Solution {
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();
        char[] arr = password.toCharArray();
        int score = 0;
        for (char c : arr) {
            if (!set.contains(c)) {
                set.add(c);
                if (c >= 'a' && c <= 'z')
                    score = score + 1;
                else if (c >= 'A' && c <= 'Z')
                    score = score + 2;
                else if (c >= '0' && c <= '9')
                    score = score + 3;
                else
                    score = score + 5;
            }
        }
        return score;
    }
}