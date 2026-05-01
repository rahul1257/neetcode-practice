class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                char searchValue = board[r][c];
                if(searchValue == '.') {
                    continue;
                }
                String squareKey = (r/3) + "," + (c/3);

                if(rows.computeIfAbsent(r, k -> new HashSet<>()).contains(searchValue) ||
                    cols.computeIfAbsent(c, k -> new HashSet<>()).contains(searchValue) ||
                    squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(searchValue)) {
                        return false;
                    }

                rows.get(r).add(searchValue);
                cols.get(c).add(searchValue);
                squares.get(squareKey).add(searchValue);
            }
        }
        return true;
    }
}
