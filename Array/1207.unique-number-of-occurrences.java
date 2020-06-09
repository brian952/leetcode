/*
 * @lc app=leetcode id=1207 lang=java
 *
 * [1207] Unique Number of Occurrences
 */

// @lc code=start
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        Set<Integer> set = new HashSet<Integer>();
        for(int j : map.values()){
            if(set.contains(j)){
                return false;
            }
            set.add(j);
        }

        return true;
    }
}
// @lc code=end

