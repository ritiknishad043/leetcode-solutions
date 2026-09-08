class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        if(target<n || target>n*k){
            return 0;
        }
        int MOD = 1_000_000_007;
        int[][] dp=new int[n+1][target+1];
        dp[0][0]=1;
        for(int dice=1;dice<=n;dice++){
            int minSum = dice;
            int maxSum = Math.min(target, dice * k);
            for(int sum=minSum;sum<=maxSum;sum++){
                for (int face=1;face<=k;face++){
                    if(sum-face>= 0) {
                        dp[dice][sum]=(dp[dice][sum]+dp[dice-1][sum-face])%MOD;
                    }
                }
            }
        }
        return dp[n][target];
    }
}