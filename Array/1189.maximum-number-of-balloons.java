/*
 * @lc app=leetcode id=1189 lang=java
 *
 * [1189] Maximum Number of Balloons
 */

// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text.length() < 7 || text == "") return 0;
        
        int[] arr = new int[26];
        
        for(int i = 0; i < text.length(); i++){
            arr[text.charAt(i) - 'a']++;
        }
        
        int min = Math.min(arr[0], arr[1]);
        min = Math.min(min, arr[13]); 
        min = Math.min(min, arr[11]/2); 
        min = Math.min(min, arr[14]/2); 
        return min;
    }
}
// @lc code=end

