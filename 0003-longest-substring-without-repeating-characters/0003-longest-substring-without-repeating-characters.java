class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map <Character,Integer> freq = new HashMap<>();
        int low =0,high=0,maxlen=0;
        for(high=0;high<s.length();high++){
            char c = s.charAt(high);
            freq.put(c,freq.getOrDefault(c,0)+1);
            while(freq.get(c)>1){
                char leftchar = s.charAt(low);
                freq.put(leftchar,freq.get(leftchar)-1);
                if(freq.get(leftchar)==0){
                    freq.remove(leftchar);
                }
                low++;
            }
            maxlen = Math.max(maxlen,high-low+1);
        }
        return maxlen;
    }
}