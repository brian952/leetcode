/*
 * @lc app=leetcode id=961 lang=java
 *
 * [961] N-Repeated Element in Size 2N Array
 */

// @lc code=start
class Solution {
    public int repeatedNTimes(int[] A) {
        for(int i = 2; i < A.length; i++){
            if(A[i] == A[i-1] || A[i] == A[i-2]){
                return A[i];
            }
        }
        return A[0];
    }
}
// @lc code=end

