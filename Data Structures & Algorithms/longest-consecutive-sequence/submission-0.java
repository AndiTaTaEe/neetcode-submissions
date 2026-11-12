class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        // adding the numbers in the set
        for (int num : nums){
            numbers.add(num);
        }
    
        int maxSequence = 0;
        for (int num: numbers){
            if(!numbers.contains(num-1)){
                int length = 1;
                while(numbers.contains(num + length)){
                    length++;
                }
                maxSequence = Math.max(maxSequence, length);
            }
        }
        return maxSequence;
        
    }
}
