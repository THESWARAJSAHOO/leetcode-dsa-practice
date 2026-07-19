class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack<>();
        int i;
        StringBuilder res = new StringBuilder();
        for(i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
                continue;
            }
            if(st.peek()==c){
                st.pop();
                continue;
            }
            st.push(c);
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}