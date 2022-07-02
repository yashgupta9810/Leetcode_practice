class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        int [] dp=  new int[n+1];
        
        int ans = memo(cost , n, dp);
        return ans;
    }
    public int memo(int []cost ,int n , int[]dp){
          if(n<=1){
            return dp[n]=cost[n];
          }
        if(dp[n]!=0){
            return dp[n];
        }
        int fcal = memo(cost , n-1,dp);
        int scal = memo(cost, n-2 ,dp);
        int ans = Math.min(fcal,scal)+(n==cost.length?0:cost[n]);
        return dp[n] = ans;
    }
}