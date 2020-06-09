/*
 * @lc app=leetcode id=1351 lang=java
 *
 * [1351] Count Negative Numbers in a Sorted Matrix
 */

// @lc code=start
class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int res=0;
        int lastNeg = cols-1;
        for(int i = 0; i < rows; i++){
            if(grid[i][0] < 0){
                res += cols;
                continue;
            }

            if(grid[i][cols-1] > 0){
                continue;
            }

            int l = 0, r = lastNeg;

            while(l <= r){
                int m  = l + (r - l)/2;
                if(grid[i][m]<0){
                    r = m -1;
                }else{
                    l = m + 1;
                }
            }
            res += cols - l;
            lastNeg = l;
        }

        return res;
    }
}
// @lc code=end

