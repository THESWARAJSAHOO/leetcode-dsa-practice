class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer>freq = new HashMap<>();
        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        Map<Character,Integer>need = new HashMap<>();
        need.put('b',1);
        need.put('a',1);
        need.put('l',2);
        need.put('o',2);
        need.put('n',1);
        int result = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer>entry : need.entrySet()){
            char c = entry.getKey();
            int required = entry.getValue();
            int available = freq.getOrDefault(c,0);
            result = Math.min(result,available/required);
        }
        return result;
    }
}