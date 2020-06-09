/*
 * @lc app=leetcode id=1078 lang=java
 *
 * [1078] Occurrences After Bigram
 */

// @lc code=start
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> lst = new ArrayList<String>();
        String[] arr = text.split(" ");
        for(int i = 0; i < arr.length-2; i++){
            if(first.equals(arr[i]) && second.equals(arr[i+1])){
                lst.add(arr[i+2]);
            }

        }
        return lst.toArray(new String[lst.size()]);
    }
}
// @lc code=end

