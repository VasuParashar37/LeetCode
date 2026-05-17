class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        if(s.length()<2)return false;
        char[]chr = s.toCharArray();
        for(int i=1;i<chr.length;i++){
            if(Math.abs((chr[i]-'0') - (chr[i-1]-'0'))>2)return false;
        }
        return true;
    }
}