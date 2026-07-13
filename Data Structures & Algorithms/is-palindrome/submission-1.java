class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            var cl = s.charAt(left);
            var cr = s.charAt(right);
            if (!Character.isLetterOrDigit(cl)) {
                left++;
            } else if (!Character.isLetterOrDigit(cr)) {
                right--;
            } else if (cl != cr
                && (Character.isDigit(cl) || Character.isDigit(cr) || Math.abs(cl - cr) != 32)) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}
