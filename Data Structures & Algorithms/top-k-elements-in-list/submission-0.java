class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (!freq.containsKey(nums[i])){
                freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            } else {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            }
        }
        // inserare HashMap -  [1,2,2,3,3,3]; k = 2
        // hashmap = 1: 1, 2: 2, 3: 3
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b) -> b[0] - a[0]);
        int[] res = new int[k];
        for (int i = 0; i< k ; i++){
            res[i] = arr.get(i)[1];
        }
        return res;
        
        

        
        
    }
}
