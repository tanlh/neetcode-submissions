class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int max = 0;
        while (left < right) {
            var curr = Math.min(heights[left], heights[right]) * (right - left);
            max = Math.max(curr, max);
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }

        return max;
    }
}
