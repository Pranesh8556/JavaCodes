import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        int max = 0;
        for (int x : c) max = Math.max(max, x);
        List<Boolean> res = new ArrayList<>();
        for (int x : c) res.add(x + e >= max);
        return res;
    }
}
