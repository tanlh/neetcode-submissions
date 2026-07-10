class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (var s : strs) {
            var count = new int[26];
            for (var c : s.toCharArray()) {
                count[c - 'a']++;
            }

            var sb = new StringBuilder();
            for (var i : count) {
                sb.append("#").append(i);
            }

            var key = sb.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
