class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();
        for (var i = 0; i < s.length(); i++) {
            sCount.merge(s.charAt(i), 1, Integer::sum);
            tCount.merge(t.charAt(i), 1, Integer::sum);
        }

        return sCount.equals(tCount);
    }
}
