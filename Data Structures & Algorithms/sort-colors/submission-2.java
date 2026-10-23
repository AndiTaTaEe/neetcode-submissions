class Solution {
    public void sortColors(int[] nums) {
        // count the appearences of 0,1, 2
        int c0=0, c1=0, c2=0;
        // traversed the nums array in order to get the appearences of the numbers
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                c0++;
            } else if (nums[i] == 1){
                c1++;
            } else {
                c2++;
            }
        }
        // c0 = 1, c1 = 2, c2=1
        int index = 0;
        for (int i = 0; i < c0; i++){
            nums[index++] = 0;
        }
        for (int i = 0; i < c1; i++){
            nums[index++] = 1;
        }
        for (int i = 0; i < c2; i++){
            nums[index++] = 2;
        }


    }
}