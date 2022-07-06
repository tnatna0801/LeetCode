import java.util.*;

class Solution {
    /*
    output: 중복을 제거한 배열 길이, 중복을 제거한 배열
    공간복잡도: O(1) 유지
    배열은 오름차순으로 정렬되어있음
    Arrays.sort를 쓰지 말아야 runtime 줄일 수 있을 듯.
    */
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}