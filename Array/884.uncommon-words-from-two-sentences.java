/*
 * @lc app=leetcode id=884 lang=java
 *
 * [884] Uncommon Words from Two Sentences
 */

// @lc code=start
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        for(String i : (A + " " + B).split(" ")){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<String> result = new ArrayList<>();
        for(String i : map.keySet()){
            if(map.get(i) == 1){
                result.add(i);
            }
        }

        return result.toArray(new String[0]);
    }
}
// @lc code=end

