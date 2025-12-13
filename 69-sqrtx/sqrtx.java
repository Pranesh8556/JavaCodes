class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0; // edge case

        int low = 1;
        int high = x;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long)mid * mid == x) {
                return mid; // perfect square
            } else if ((long)mid * mid < x) {
                low = mid + 1; // move right
            } else {
                high = mid - 1; // move left
            }
        }

        return high; // largest integer whose square <= x
    }
}
