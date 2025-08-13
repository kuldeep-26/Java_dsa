public class solution {
    public static int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;

        int[] rotRow = new int[rows * cols];
        int[] rotCol = new int[rows * cols];

        int freshCount = 0;
        int rotCount = 0; // how many rotten oranges we have in array
        int minutes = 0;

        // Step 1: Initialize rotten array & count fresh oranges
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    rotRow[rotCount] = r;
                    rotCol[rotCount] = c;
                    rotCount++;
                } else if (grid[r][c] == 1) {
                    freshCount++;
                }
            }
        }

        if (freshCount == 0) return 0; // no fresh oranges

        // Directions for up, down, left, right
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        // Step 2: BFS simulation using arrays
        int currentIndex = 0; // start of current batch
        while (currentIndex < rotCount) {
            int currentBatchSize = rotCount - currentIndex;
            boolean rottedThisMinute = false;

            for (int i = 0; i < currentBatchSize; i++) {
                int r = rotRow[currentIndex];
                int c = rotCol[currentIndex];
                currentIndex++;

                for (int k = 0; k < 4; k++) {
                    int nr = r + dr[k];
                    int nc = c + dc[k];
                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2; // rot it
                        freshCount--;
                        rotRow[rotCount] = nr;
                        rotCol[rotCount] = nc;
                        rotCount++;
                        rottedThisMinute = true;
                    }
                }
            }

            if (rottedThisMinute) minutes++;
        }

        return freshCount == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        int result = orangesRotting(grid);
        System.out.println("Minutes to rot all oranges: " + result);
    }
}
