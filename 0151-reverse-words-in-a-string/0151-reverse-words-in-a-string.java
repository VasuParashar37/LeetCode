class Solution {
    public String reverseWords(String s) {
        // s = s.trim();
        String[]arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        int i=0; int j=arr.length-1;
        while(i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        System.out.println(Arrays.toString(arr));
        String str="";
        for(int k=0;k<arr.length;k++){
            if(arr[k]!=""){
                str+=arr[k];
                str+=" ";
            }
        }
        return str.trim();
    }
}