import java.util.*;

class Solution {
    /*
    output: 중복을 제거한 배열 길이, 중복을 제거한 배열
    공간복잡도: O(1) 유지 ==> 새로운 배열을 만들지 X
    배열은 오름차순으로 정렬되어있음
    */
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            if(num == 101){
                break;
            }
            for(int j = i; j<nums.length; j++){
                if(num != nums[j]){
                    i = j-1;
                    break;
                }
                else if(num == nums[j]){
                    nums[j] = 101;
                    result--;
                }
            }
            nums[i] = num;
            result++;
        }
        Arrays.sort(nums);
        return nums.length + result; 
    }
}