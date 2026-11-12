class Solution {
    public int subarraySum(int[] nums, int k) {
        // prefix sum method
        int prefixSum = 0;
        int count = 0;
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1);

        for (int num : nums){
            prefixSum += num;
            if (prefixSumFreq.containsKey(prefixSum - k)){
                count += prefixSumFreq.get(prefixSum-k);
            }
            prefixSumFreq.put(prefixSum, prefixSumFreq.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
        
    }
}