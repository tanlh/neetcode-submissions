class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (var r = 0; r < 9; r++) {
            for (var c = 0; c < 9; c++) {
                var val = board[r][c];
                if (val == '.') {
                    continue;
                }
                var rowKey = val + "_row_" + r;
                var colKey = val + "_col_" + c;
                var boxKey = val + "_box_" + (r / 3) + "_" + (c / 3);

                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
                }
            }
        }
        return true;
    }
}
