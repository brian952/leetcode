import java.util.HashSet;

/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for(char i : S.toCharArray()){
            if(J.indexOf(i)!=-1){
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

