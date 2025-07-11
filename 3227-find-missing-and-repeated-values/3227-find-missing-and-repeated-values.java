class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];

        // First iteration: mark visited cells using negative sign
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cur = Math.abs(grid[i][j]);
                int row = (cur - 1) / n;
                int col = (cur - 1) % n;

                if (grid[row][col] < 0) {
                    ans[0] = cur;  // Repeated value found
                } else {
                    grid[row][col] *= -1;
                }
            }
        }

        // Second iteration: find missing value (positive value left)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    ans[1] = i * n + j + 1;  // Missing value
                }
            }
        }

        return ans;
    }
}
