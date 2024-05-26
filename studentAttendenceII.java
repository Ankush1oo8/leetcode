public class studentAttendenceII {
    public int checkRecord(int n) {
        long dp[][] = {{1, 1, 0}, {1, 0, 0}};
        for (int i = 2; i <= n; i++) {
            long ndp[][] = {{0, 0, 0}, {0, 0, 0}};
            ndp[0][0] = (int)((dp[0][0] + dp[0][1] + dp[0][2]) % 1000000007) ;
            ndp[0][1] = dp[0][0];
            ndp[0][2] = dp[0][1];
            ndp[1][0] = (int)((dp[0][0] + dp[0][1] + dp[0][2] + dp[1][0] + dp[1][1] + dp[1][2]) % 1000000007);
            ndp[1][1] = dp[1][0];
            ndp[1][2] = dp[1][1];
            dp = ndp;
        }
        long res = 0;
        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < 3; j ++) {
                res = (res + dp[i][j]) % 1000000007;
            }
        }
        return (int)res;
    }

}
