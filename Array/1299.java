class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = arr.length - 1, x = -1; i >= 0; i--)
        {
            x = Math.max(arr[i], arr[i] = x);
        }
        return arr;
    }
}