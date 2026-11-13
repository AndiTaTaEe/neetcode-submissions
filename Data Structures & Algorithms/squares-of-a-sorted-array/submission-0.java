class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int resIdx = n - 1;
        while (left <= right){
            if (Math.abs(nums[left]) > Math.abs(nums[right])){
                result[resIdx] = nums[left] * nums[left];
                left++;
            } else {
                result[resIdx] = nums[right] * nums[right];
                right--;
            }
            resIdx--;
        }
        return result;
        
    }
}