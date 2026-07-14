class Solution {
    public int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }

        var n = height.length;
        var ans = 0;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        prefixMax[0] = Integer.MIN_VALUE;
        suffixMax[n - 1] = Integer.MIN_VALUE;

        for (var i = 1; i < n - 1; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i - 1]);
        }

        for (var i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i + 1]);
        }

        for (var i = 0; i < n; i++) {
            var minHeight = Math.min(prefixMax[i], suffixMax[i]);
            if (height[i] < minHeight) {
                ans += minHeight - height[i];
            }
        }

        return ans;
    }
}
