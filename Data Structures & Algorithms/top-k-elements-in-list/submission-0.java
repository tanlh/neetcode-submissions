class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (var n : nums) {
            freq.merge(n, 1, Integer::sum);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        freq.forEach((n, f) -> {
            if (buckets[f] == null) {
                buckets[f] = new ArrayList<>();
            }
            buckets[f].add(n);
        });

        var result = new int[k];
        var index = 0;
        for (var i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (var n : buckets[i]) {
                    result[index++] = n;
                    if (index == k) return result;
                }
            }
        }

        return result;
    }
}
