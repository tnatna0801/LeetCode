class Solution {
    public int strStr(String haystack, String needle) {
        
        int len = needle.length();
        
        for (int i = 0; i<=haystack.length()- len; i++){
            String s = haystack.substring(i, i+len);
            
            if(s.equals(needle)){
                return i;
            }
        }
        
        return -1;
        
    }
}