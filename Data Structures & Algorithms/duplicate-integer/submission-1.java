class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicate = new HashSet<>();

        for (int i : nums){
            if(duplicate.contains(i)){
                return true;
            }
            duplicate.add(i);
        }
        return false;
        
    }
}