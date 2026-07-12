class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (var n : nums) {
            seen.add(n);
        }

        var maxStreak = 0;
        for (var n : nums) {
            if (seen.contains(n - 1)) {
                continue;
            }

            var curr = n;
            var streak = 1;
            while (seen.contains(curr + 1)) {
                curr++;
                streak++;
            }

            maxStreak = Math.max(maxStreak, streak);
        }

        return maxStreak;
    }
}
