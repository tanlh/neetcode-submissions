class Solution {
    public int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        var ans = 0;

        while (left < right) {
            int hl = height[left], hr = height[right];

            if (hl < hr) {
                if (hl >= leftMax) {
                    leftMax = hl;
                } else {
                    ans += leftMax - hl;
                }
                left++;
            } else {
                if (hr >= rightMax) {
                    rightMax = hr;
                } else {
                    ans += rightMax - hr;
                }
                right--;
            }
        }

        return ans;
    }
}
