class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int res = 10, unique = 9, avail = 9;
        for (int i = 2; i <= n && avail > 0; i++) {
            unique *= avail--;
            res += unique;
        }
        return res;
    }
}
