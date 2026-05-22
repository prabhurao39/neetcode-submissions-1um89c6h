class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();
        if (s.length() == 1) return 1;
        char[] ch = s.toCharArray();
        int len =0;
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0, j = 0; j < n ; j++) {
            if (hs.containsKey(ch[j]) && i <= hs.get(ch[j])) {
                i = hs.get(ch[j]) + 1;
            }
            hs.put(ch[j], j);
            len = Math.max(len, j - i + 1);
        }
        return len;
    }
}
