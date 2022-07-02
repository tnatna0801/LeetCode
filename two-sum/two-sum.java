import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i); // 값, 인덱스
        }
        
        //1.
        for(int i = 0; i<nums.length; i++){  //값
            if(map.containsKey(target - nums[i]) && map.get(target-nums[i]) != i ){ //target-nums[i]을 가진 키
                return new int[] {i, map.get(target-nums[i])};
            }
        }
        
        //2 hash map 이라 [3,3] 6 일때 null을 리턴한다. 
        //  for(Integer key : map.keySet()){ 
        //      System.out.println(key + "      " + map.get(key)); 3   1
        //     if(map.containsKey(target - key) && map.get(target-key) != map.get(key)){ target-nums[i]을 가진 키를 어떻게 찾을지 모르겠다(만약 map의 key가 인덱스고 value이 값일 때)
        //         return new int[] {map.get(key), map.get(target-key)};
        //     }
        // }
        
        return null;
    }
}
