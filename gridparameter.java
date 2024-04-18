public class gridparameter {
   public int islandPerimeter(int[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) { // Only consider cells that are land (1)
                        // Check the four directions (up, right, down, left)
                        // If a cell is on the edge of the grid or its neighbor is water (0), increment count
                        if (i == 0 || grid[i - 1][j] == 0) { // Top edge or above is water
                            count++;
                        }
                        if (j == 0 || grid[i][j - 1] == 0) { // Left edge or to the left is water
                            count++;
                        }
                        if (i == grid.length - 1 || grid[i + 1][j] == 0) { // Bottom edge or below is water
                            count++;
                        }
                        if (j == grid[0].length - 1 || grid[i][j + 1] == 0) { // Right edge or to the right is water
                            count++;
                        }
                    }
                }
            }
            return count;
        }
    }
    

