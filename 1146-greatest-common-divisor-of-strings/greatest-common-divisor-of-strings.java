class Solution {
    public String gcdOfStrings(String a, String b) {
        return (a + b).equals(b + a) ? a.substring(0, gcd(a.length(), b.length())) : "";
    }
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
