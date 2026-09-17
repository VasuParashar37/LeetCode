class Solution {
    int getSum(int a, int b) {
        int carry = 0, sum = 0;
        while(b!=0){
            sum = (a^b);
            carry = (a&b) << 1;

            a = sum;
            b = carry;
        }
        return a;
    }
};