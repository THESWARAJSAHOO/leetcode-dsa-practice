class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[]res = new int [nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            int idx = i%nums.length;
            while(!st.isEmpty() && nums[idx]>=nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                res[idx]=-1;
            }
            else{
                res[idx] = nums[st.peek()];
            }
            st.push(idx);
        }
        return res;
    }
}