class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (var n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int frequency = entry.getValue();
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(entry.getKey());
        }

        var result = new int[k];
        var index = 0;
        for (var i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (var n : buckets[i]) {
                    result[index++] = n;
                    if (index == k)
                        return result;
                }
            }
        }

        return result;
    }
}
