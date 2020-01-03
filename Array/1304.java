class Solution {
    public int[] sumZero(int n) {
        int[] a = new int[n];
        int index = 0;
        for(int i = 1; i <= n/2; ++i)
        {
            if(index < n)
            {
                a[index] = i;
                a[index+1] = -i;
                index += 2;
            }
        }
        if(n%2 != 0){a[index] = 0;}
        return a;
    }
}