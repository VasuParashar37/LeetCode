class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        boolean flag = true;
        for (int i = 0; i <= n - m; i++) {
            flag = true;
            String sub = s.substring(i, i+m);
            int[]freq = new int[26];
            for(char ch:sub.toCharArray())
                freq[ch-'a']++;
            for(char ch:p.toCharArray())
                freq[ch-'a']--;
            for(int a:freq)
                if(a!=0)flag = false;
            if(flag)list.add(i);
        }
        return list;
    }
}