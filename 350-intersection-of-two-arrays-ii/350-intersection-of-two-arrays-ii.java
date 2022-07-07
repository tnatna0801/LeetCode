class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1.length >= nums2.length){
            return solution(nums1, nums2);
        }
        else {
            return solution(nums2, nums1);
        }
    }
    
    public int[] solution(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        
        for(int num:nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        for(int num:nums2){
            if(map.containsKey(Integer.valueOf(num)) && map.get(Integer.valueOf(num)) > 0){
                map.put(Integer.valueOf(num), map.get(Integer.valueOf(num))-1);
                tmp.add(num);
            }
        }
        
        return tmp.stream().mapToInt(i -> i).toArray();
    }
}