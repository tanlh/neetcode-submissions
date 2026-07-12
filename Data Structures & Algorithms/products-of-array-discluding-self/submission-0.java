class Solution {
    public int[] productExceptSelf(int[] nums) {
        var n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;

        for (var i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        var right = 1;
        for (var i = n - 2; i >= 0; i--) {
            right *= nums[i + 1];
            ans[i] *= right;
        }

        return ans;
    }
}
