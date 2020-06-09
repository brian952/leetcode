class Solution {
    public int heightChecker(int[] heights) {
        int[] a = new int[101];
        for(int i : heights)
        {
            a[i]++;
        }
        
        int res = 0;
        int currentH = 0;
        
        for(int i = 0; i < heights.length; i++)
        {
            while(a[currentH] == 0)
            {
                currentH++;
            }
            
            if(currentH != heights[i])
            {
                res++;
            }
            a[currentH]--;
        }
        
        return res;
    }
}