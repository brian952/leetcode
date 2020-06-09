import java.util.LinkedList;

/*
 * @lc app=leetcode id=1409 lang=java
 *
 * [1409] Queries on a Permutation With Key
 */

// @lc code=start
class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> lst = new LinkedList<>();
        int[] res = new int[queries.length];
        for(int i = 1; i <= m; i++){
            lst.add(i);
        }

        for(int i = 0; i < queries.length; i++){
            int num = queries[i];
            int index = lst.indexOf(num);
            int val = lst.get(index);
            lst.remove(index);
            lst.addFirst(val);
            res[i] = index;

        }

        return res;
    }
}
// @lc code=end

