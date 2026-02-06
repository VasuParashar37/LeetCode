class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        System.out.println(map.size());
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
                System.out.println(map);  
                if(map.get(t.charAt(i))==0)map.remove(t.charAt(i)); 
            }
            System.out.println(map.size());        
        }
        System.out.println(map.size());
        return map.size()==0;
    }
}