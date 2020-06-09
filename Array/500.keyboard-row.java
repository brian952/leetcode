/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 *
 * https://leetcode.com/problems/keyboard-row/description/
 *
 * algorithms
 * Easy (64.01%)
 * Likes:    501
 * Dislikes: 618
 * Total Accepted:    106.9K
 * Total Submissions: 166.9K
 * Testcase Example:  '["Hello","Alaska","Dad","Peace"]'
 *
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image
 * below.
 * 
 * 
 * 
 * 
 * 
 * 
 * Example:
 * 
 * 
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> pattern = new HashMap<>();
        for (char letter : "qwertyuiop".toCharArray()) {
            pattern.put(letter, 1);
        }
        for (char letter : "asdfghjkl".toCharArray()) {
            pattern.put(letter, 2);
        }
        for (char letter : "zxcvbnm".toCharArray()) {
            pattern.put(letter, 3);
        }
        List<String> resultList = new ArrayList<>();
        for (String word : words) {
            String wordLower = word.toLowerCase();
            int category = pattern.get(wordLower.charAt(0));
            boolean isSameCategory = true;
            for (char letter : wordLower.toCharArray()) {
                if (pattern.get(letter) != category) {
                    isSameCategory = false;
                    break;
                }
            }
            if (isSameCategory) {
                resultList.add(word);
            }
        }
        return resultList.toArray(new String[resultList.size()]);
    }
}
// @lc code=end

