class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>freq = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        int length = 0;
        boolean hasOdd = false;
        for(int count : freq.values()){
            length += (count/2)*2;
            if(count%2==1){
                hasOdd = true;
            }
        }
        if(hasOdd){
            length+=1;
        }
        return length;
    }
}