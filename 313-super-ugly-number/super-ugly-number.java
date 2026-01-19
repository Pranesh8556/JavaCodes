class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] dp = new long[n];
        dp[0] = 1;

        int k = primes.length;
        int[] idx = new int[k];

        for (int i = 1; i < n; i++) {
            long next = Long.MAX_VALUE;

            for (int j = 0; j < k; j++) {
                next = Math.min(next, dp[idx[j]] * primes[j]);
            }

            dp[i] = next;

            for (int j = 0; j < k; j++) {
                if (dp[i] == dp[idx[j]] * primes[j]) {
                    idx[j]++;
                }
            }
        }

        return (int) dp[n - 1];
    }
}
