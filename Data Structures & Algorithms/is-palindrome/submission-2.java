class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        while (s.length() >1 && !Character.isLetterOrDigit(s.charAt(s.length()-1))) {
            s = s.substring(0, s.length()-1);
        }
        
        
        int n = s.length();

        for (int i=0, j=n-1; i<j; i++,j--) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
                

        }
        return true;
    }
}
