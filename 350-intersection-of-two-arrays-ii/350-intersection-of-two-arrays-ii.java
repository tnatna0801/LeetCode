class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for(int num:nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        for(int num:nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                map.put(num, map.get(num)-1);
                resultList.add(num);
            }
        }
        
        int[] result = new int[resultList.size()];
        int i = 0;
        for(Integer num:resultList){
            result[i++] = num;
        }
        return result;
        
    }
    
}