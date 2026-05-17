class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        if (ss.length != tt.length) 
            return false;
            
        Arrays.sort(ss);
        Arrays.sort(tt);
        for (int i=0; i<ss.length; i++) {
            if (tt[i] != ss[i])
                return false;
        }

        return true;
    }
}
