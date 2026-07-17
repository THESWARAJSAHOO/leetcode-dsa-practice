class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>res = new ArrayList<>();
        int start=newInterval[0],end = newInterval[1];
        boolean inserted = false;
        for(int i=0;i<intervals.length;i++){
            int[]curr = intervals[i];
            if(curr[1]<start){
                res.add(curr);
            }
            else if(curr[0]>end){
                if(!inserted){
                    res.add(new int[]{start,end});
                    inserted = true;
                }
                res.add(curr);
            }
            else{
                start = Math.min(start,curr[0]);
                end = Math.max(end,curr[1]);
            }
        }
        if(!inserted){
            res.add(new int[]{start,end});
        }
        return res.toArray(new int[res.size()][]);
    }
}