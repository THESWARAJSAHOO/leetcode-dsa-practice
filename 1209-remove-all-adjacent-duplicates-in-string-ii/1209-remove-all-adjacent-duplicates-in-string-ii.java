class Solution {
    public String removeDuplicates(String s, int k) {
        Stack <int[]> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && st.peek()[0]==c){
                st.peek()[1]++;
                if(st.peek()[1]==k){
                    st.pop();
                }
            }
            else{
                st.push(new int[]{c,1});
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<st.size();i++){
            int[]pair = st.get(i);
            for(int j=0;j<pair[1];j++){
                sb.append((char)pair[0]);
            }
        }
        return sb.toString();
    }
}