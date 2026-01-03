class Solution {
    public String addBinary(String a, String b) {
        
        if(a.length() < b.length()) return addBinary(b, a);
        int m = a.length(), n = b.length();
        char[] cs = new char[m + 1];
        int index1 = m -1, index2 = n - 1, index = m;
        
        int carry = 0;
        while(index1 >= 0 ){
            if(index1 >= 0) carry += a.charAt(index1--) - '0';
            if(index2 >= 0) carry += b.charAt(index2--) - '0';
            cs[index--] =  (char)(carry % 2 + '0');
            carry /= 2;
        }
        
        if(carry == 0) return new String(cs, 1, m);
        cs[0] = '1';
        return new String(cs);
    }
}