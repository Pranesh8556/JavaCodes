class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        for (String s : strs)
            while (!s.startsWith(pre))
                pre = pre.substring(0, pre.length() - 1);
        return pre;
    }
}
