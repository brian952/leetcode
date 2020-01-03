class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int i = 0, j = A.length - 1;
        for(int b : A)
        {
            if(b%2 != 0){res[j] = b; j--;}
            else{res[i] = b; i++;}
        }
        return res;
    }
}