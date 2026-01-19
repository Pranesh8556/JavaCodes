import java.util.*;
class Solution {
    public String mostCommonWord(String p, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        for (String w : p.toLowerCase().split("\\W+"))
            if (!ban.contains(w))
                map.put(w, map.getOrDefault(w, 0) + 1);
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
