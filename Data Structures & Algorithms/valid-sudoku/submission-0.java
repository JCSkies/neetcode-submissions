class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '.') continue;

                String boxIndex = (row / 3) + "," + (col / 3);


                if
                (rows.computeIfAbsent(row, k -> new HashSet<>()).contains(board[row][col]) ||
                
                cols.computeIfAbsent(col, k -> new HashSet<>()).contains(board[row][col]) ||
                
                squares.computeIfAbsent(boxIndex, k -> new HashSet<>()).contains(board[row][col])) {
                    return false;
                } 

                squares.get(boxIndex).add(board[row][col]);
                rows.get(row).add(board[row][col]);
                cols.get(col).add(board[row][col]);
            }
        }

        return true;
    }
}
