class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer>map=new HashMap<>();
        HashMap<Character, Integer>mapC=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            char ch = chars.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int totalLength = 0;
        for(int i=0;i<words.length;i++){
            String word = words[i];
            mapC = new HashMap<>(map);
            System.out.println(mapC);
            boolean found = true;
            for(int j=0;j<word.length();j++){
                char ch = word.charAt(j);
                System.out.println(ch);
                if(mapC.containsKey(ch) && mapC.get(ch)>0){
                    mapC.put(ch, mapC.get(ch)-1);
                }
                else{
                    found=false;
                    break;
                } 
            }
            if(found)
                totalLength+= word.length();
        }
        return totalLength;
    }
}