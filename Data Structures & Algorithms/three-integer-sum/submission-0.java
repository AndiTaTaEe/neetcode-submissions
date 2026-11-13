class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort the numbers
        Arrays.sort(nums);
        // hash map solution
        // put the numbers from nums in a freq hash Map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>(); 
        for (int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.get(nums[i]) - 1); // make the elem seen by subtracting 1
            if (i > 0 && nums[i] == nums[i-1]){
                continue; // skip the duplicate
            }
            for (int j = i + 1; j < nums.length; j++){
                freq.put(nums[j], freq.get(nums[j]) - 1); // make the elem seen by subtracting 1
                if ( j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }
                int target = -(nums[i] + nums[j]);
                if (freq.getOrDefault(target, 0) > 0){
                    result.add(Arrays.asList(nums[i], nums[j], target));
                }
            }
            for (int j = i+1; j < nums.length; j++){
                freq.put(nums[j], freq.get(nums[j]) + 1);
            }
        }
        return result;


        
    }
}
