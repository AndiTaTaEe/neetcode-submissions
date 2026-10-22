class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int threshold = nums.length/2; 
        for (int i = 0; i < nums.length; i++){
            if(!freq.containsKey(nums[i])){
                freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            } else {
                freq.put(nums[i], freq.get(nums[i]) + 1);   
            }
            if (freq.get(nums[i]) > threshold){
                return nums[i];
            }

        }
        return 0;
        
    }
}