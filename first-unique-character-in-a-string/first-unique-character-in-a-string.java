class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int n = s.length();
        
        for(int i = 0; i<n; i++){
            char tmp = s.charAt(i);
            count.put(tmp, count.getOrDefault(tmp, 0)+1);
        }
        
        for(int i = 0; i<n; i++){
            if(count.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}