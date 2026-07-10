class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> freq = Arrays.stream(nums).boxed().collect(
            Collectors.groupingBy(n -> n, Collectors.counting()));

        return freq.keySet()
            .stream()
            .sorted(Comparator.comparingLong(freq::get).reversed())
            .limit(k)
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
