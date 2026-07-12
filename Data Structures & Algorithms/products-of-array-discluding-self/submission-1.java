class Solution {
    public int[] productExceptSelf(int[] nums) {
        var n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;

        for (var i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        var right = 1;
        for (var i = n - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}
