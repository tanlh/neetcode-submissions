class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (var i = 0; i < nums.length; i++) {
            var m = seen.get(target - nums[i]);
            if (m != null) {
                return new int[] {m, i};
            }
            seen.put(nums[i], i);
        }

        return new int[2];
    }
}
