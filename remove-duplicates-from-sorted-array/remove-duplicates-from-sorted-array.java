import java.util.*;

class Solution {
    /*
    output: 중복을 제거한 배열 길이, 중복을 제거한 배열
    공간복잡도: O(1) 유지
    배열은 오름차순으로 정렬되어있음
    */
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for(int i = nums.length-1; i>0; i--){
            if(nums[i] == nums[i-1]){
                nums[i] = 101;
                result++;
            }
        }
        Arrays.sort(nums);
        return nums.length - result;
    }
}