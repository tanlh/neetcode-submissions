class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            var curr = numbers[left] + numbers[right];
            if (curr == target) {
                return new int[] {left + 1, right + 1};
            } else if (curr < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[2];
    }
}
