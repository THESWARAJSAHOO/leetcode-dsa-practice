class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> st = new Stack<>();
        int []res =  new int[nums.length];
        Arrays.fill(res,-1);
        for(int i=0; i<2*nums.length;i++){
            int num = nums[i%nums.length];
            while(!st.isEmpty()&&nums[st.peek()]<num){
                res[st.pop()]=num;
            }
            if(i<nums.length){
                    st.push(i);
                }
        }
        return res;
    }
}