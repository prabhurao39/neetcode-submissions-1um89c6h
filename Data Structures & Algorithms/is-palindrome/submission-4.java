class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        int n = s.length();

        for (int i=0, j=n-1; i<j; i++,j--) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
                

        }
        return true;
    }
}
