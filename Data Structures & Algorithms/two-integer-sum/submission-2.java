class Solution {
    public int[] twoSum(int[] nums, int target) {
        // optimal solution
        Map<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            // check if the difference is already stored in the hashmap
            if(num.containsKey(difference)){
                return new int[]{num.get(difference), i};
            } else {
                num.put(nums[i], i);
            }
        }
        return new int[]{};
        
    }
}
