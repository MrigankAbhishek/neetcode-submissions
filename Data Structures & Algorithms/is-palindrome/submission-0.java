class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        String s1=s.toLowerCase();
        while(i<j){
            while (i < j && !alphaNum(s1.charAt(i))) {
                i++;
            }
            while (j > i && !alphaNum(s1.charAt(j))) {
                j--;
            }
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
