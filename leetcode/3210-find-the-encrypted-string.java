package leetcode;

class Solution {
    public String getEncryptedString(String s, int k) {
        k %= s.length();
        if( k == s.length()){
            return s;
        }
        else{
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(k, s.length()));
            sb.append(s.substring(0, k));
            return sb.toString();
        }
    }
}
