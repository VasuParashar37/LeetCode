class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long sum = mass;
        for(int i:asteroids){
            if(sum<i)return false;
            sum+= i;
        }
        return true;
    }
}