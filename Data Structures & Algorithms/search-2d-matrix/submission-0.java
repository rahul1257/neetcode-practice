public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int r = 0, c = n - 1;

        while ( r < m && c >= 0) {
            System.out.println("r: " + r + "c: " + c);
            if(matrix[r][c] < target) {
                r++;
            } else if(matrix[r][c] > target) {
                c--;
            } else {
                return true;
            }
        }
        return false;
    }
}