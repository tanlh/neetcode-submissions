class Solution {
    public int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }

        var n = height.length;
        var ans = 0;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        prefixMax[0] = height[0];
        suffixMax[n - 1] = height[n - 1];

        for (var i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }

        for (var i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }

        for (var i = 0; i < n; i++) {
            ans += Math.min(prefixMax[i], suffixMax[i]) - height[i];
        }

        return ans;
    }
}
