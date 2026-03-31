class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry = 0;
        int sum = 0;
        int q = 0;
        String ans = "";
        while(i>=0 && j>=0){
            char ich = a.charAt(i);
            char jch = b.charAt(j);
            int inum  = ich - '0';
            int jnum  = jch - '0';
            sum = inum + jnum + q;
            q = sum/2;
            int rem = sum % 2;
            ans+=rem;
            i--;j--;
        }
        while(i>=0){
            char ich = a.charAt(i);
            int inum  = ich - '0';
            sum = inum + q;
            q = sum/2;
            int rem = sum % 2;
            ans+=rem;
            i--;
        }
        while(j>=0){
            char jch = b.charAt(j);
            int jnum  = jch - '0';
            sum = jnum + q;
            q = sum/2;
            int rem = sum % 2;
            ans+=rem;
            j--;
        }
        if(q == 1) ans += "1";      
        return new StringBuilder(ans).reverse().toString(); 
    }
}