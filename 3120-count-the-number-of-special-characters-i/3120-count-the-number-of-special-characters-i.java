class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        char[] arr = word.toCharArray();
        char other;int count=0;
        for (char ch : arr)
            set.add(ch);
        for (char ch : set) {
            if (Character.isLowerCase(ch)) 
                other = Character.toUpperCase(ch);
             else 
                other = Character.toLowerCase(ch);
            if(set.contains(other))count++;
        }
        return count/2;
    }
}