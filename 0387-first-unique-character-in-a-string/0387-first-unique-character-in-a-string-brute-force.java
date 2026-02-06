class Solution {
    public int firstUniqChar(String s) {
        boolean isUnique;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            isUnique = true;
            for(int j=0;j<s.length();j++){
                if(i!=j && ch==s.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            System.out.println(isUnique);
            if(isUnique)return i;
        }
        return -1;
    }
}