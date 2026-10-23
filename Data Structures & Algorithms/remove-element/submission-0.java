class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0; // pointer for placing non-val elements
        int swaps = 0;
        for (int right = 0; right < nums.length; right++){
            if(nums[right] != val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                swaps++;
                left++;
            }
        }
        return swaps;
        
    }
}