/*
 * @lc app=leetcode id=1002 lang=java
 *
 * [1002] Find Common Characters
 */

// @lc code=start
class Solution {
    int[] arr = new int[26];
    public List<String> commonChars(String[] A) {
        List<String> lst = new ArrayList<String>();
        if(A == null || A.length==0) return lst;
        int[] oriA = new int[26];
        for(char i : A[0].toCharArray()){
            oriA[i - 'a']++;
        }

        for(int j = 0; j < A.length; j++){
            CompareArr(oriA, A[j]);
        }

        for(int a = 0; a < 26; a++){
            if(oriA[a] != 0){
                for(int b = 0; b < oriA[a]; b++){
                    lst.add((char)(a+'a')+ "");
                }
            }
        }
        return lst;

    }

    public void CompareArr(int[] a, String str){
        for(char c : str.toCharArray()){
            arr[c - 'a']++;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i]!= 0 && arr[i] != a[i]){
                a[i] = Math.min(arr[i], a[i]);
            }
        }
        arr = new int[26];
    }
}
// @lc code=end

