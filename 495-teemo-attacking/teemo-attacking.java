class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
           int n = timeSeries.length;
        int ans = 0;
        for(int i = 0 ; i < n-1 ; i++){
            int x = timeSeries[i] + duration;
            if(x <= timeSeries[i+1]) ans += duration;
            else{ ans += (timeSeries[i+1] - timeSeries[i]); }
        }

        return ans + duration;

        
    }
}