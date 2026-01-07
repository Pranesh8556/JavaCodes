class Solution {
    public int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int ans[] = new int[2 * arr.length];
        System.arraycopy(arr, 0, ans, 0, n);
        System.arraycopy(arr, 0, ans, n, n);
        return ans;
    }
}
