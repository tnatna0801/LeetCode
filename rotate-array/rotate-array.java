// nums 배열 자체를 뒤집을 생각을 못해내서 오래걸렸다. 또다른 배열을 만들었더니 나중에 nums에 대입할때 결과로 Output Limit Exceeded 받았다. => reverse() 함수를 만듬.
// index를 벗어났다고 runtime error가 떠버렸다. =>       
class Solution {
    public void rotate(int[] nums, int k) {
        
        System.out.println( k );
        k %= nums.length;
        System.out.println( k );
        // 1. 배열 뒤집기
        reverse(nums, 0, nums.length-1);
        
        // 2. 0~k-1 뒤집기
        reverse(nums, 0, k-1);
        
        // 3. k~끝 뒤집기
        reverse(nums, k, nums.length-1);
    
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int tmp = nums[end];
            nums[end] = nums[start];
            nums[start] = tmp;
            start += 1;
            end -= 1;
        }
    }
}