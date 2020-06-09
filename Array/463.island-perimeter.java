/*
 * @lc app=leetcode id=463 lang=java
 *
 * [463] Island Perimeter
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int isLand = 0;
        int neighbour = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    isLand++;
                    if(i < grid.length - 1 && grid[i+1][j] == 1) neighbour++;
                    if(j < grid[0].length - 1 && grid[i][j+1] == 1) neighbour++;
                }
            }
        }

        return isLand*4 - neighbour*2;
    }
}
// @lc code=end

