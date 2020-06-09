class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] a = new int[26];
        for(char i : chars.toCharArray())
        {
            a[i - 'a']++;
        }
        
        int res = 0;
        for(String j : words)
        {
            int[] tmp = Arrays.copyOf(a, a.length);
            boolean good = true;
            char[] chs = j.toCharArray();
            for(char ch : chs)
            {
                tmp[ch - 'a']--;
                if(tmp[ch - 'a'] < 0) 
                {
                    good = false;
                    break;
                }
            }
            if(good) res += j.length();
        }
        
        return res;
    }
}