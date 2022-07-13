//소문자만 => 26개
//toCharArray(): 문자열을 char형 배열로 바꿔줌
//배열에 각 알파벳의 횟수를 저장

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] array = new int[26];

        for (char c : s.toCharArray()) {
            array[c - 97] += 1;
        }

        for (char c : t.toCharArray()) {
            array[c - 97] -= 1;
        }

        for (int e : array) {
            if (e != 0) {
                return false;
            }
        }

        return true;
    }
}