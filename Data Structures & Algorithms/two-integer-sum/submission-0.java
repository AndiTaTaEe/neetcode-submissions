class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> indici = new HashMap<>();
       for (int i =0;i<nums.length;i++){
        indici.put(nums[i],i);
       }
       for (int i = 0; i<nums.length;i++){
        int diff=target-nums[i];
        if(indici.containsKey(diff)&&indici.get(diff)!=i){
            return new int[]{i, indici.get(diff)};
        }
       }
       return new int[0]; 
    }
}
