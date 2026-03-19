class Solution {
    public String reverseVowels(String s) {
        int i=0;int j=s.length()-1;
        char[]arr = s.toCharArray();
        while(i<j){
            char ich = Character.toUpperCase(arr[i]);
            System.out.println(ich);
            char jch = Character.toUpperCase(arr[j]);
            System.out.println(jch);
            while(i<j && !(ich=='A'||ich=='E'||ich=='I'||ich=='O'||ich=='U')){
                i++;
                ich = Character.toUpperCase(arr[i]);
            }
            while(i<j && !(jch=='A'||jch=='E'||jch=='I'||jch=='O'||jch=='U')){
                j--;
                jch = Character.toUpperCase(arr[j]);
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String str = new String(arr);
        return str;
    }
}