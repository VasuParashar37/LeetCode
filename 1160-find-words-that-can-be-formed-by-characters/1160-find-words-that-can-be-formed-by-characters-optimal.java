class Solution {
    public int countCharacters(String[] words, String chars) {
        int[]arr1 = new int[26];
        int[]arr2;int totalLength = 0;
        for(int i=0;i<chars.length();i++)
            arr1[chars.charAt(i) - 'a']++;
        for(String word:words){
            arr2 = new int[26];
            boolean found = true;
            for(int i=0;i<word.length();i++){
                arr2[word.charAt(i) - 'a']++;
            }
            for(int j=0;j<26;j++){
                if(arr2[j]>arr1[j]){
                    found = false;
                    break;
                }
            }
            if(found)
                totalLength+=word.length();
        }
        return totalLength;
    }
}