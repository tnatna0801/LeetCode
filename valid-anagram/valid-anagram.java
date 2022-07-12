class Solution {
    public boolean isAnagram(String s, String t) {
        int[] array = new int[26];

        for (char c : s.toCharArray()) {
            array[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            array[c - 'a']--;
        }

        for (int e : array) {
            if (e != 0) {
                return false;
            }
        }

        return true;
    }
}