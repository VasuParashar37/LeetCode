class Solution {
    public boolean isValid(String s) {
        char[] para = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < para.length; i++) {
            if (para[i] == '(' || para[i] == '[' || para[i] == '{')
                st.push(para[i]);
            else if (!st.isEmpty() && (para[i] == ')' &&
                    st.peek() == '('
                    || para[i] == ']' &&
                            st.peek() == '['
                    || para[i] == '}' &&
                            st.peek() == '{'))
                st.pop();
            else return false;
        }                                          
        return st.isEmpty();
    }
}