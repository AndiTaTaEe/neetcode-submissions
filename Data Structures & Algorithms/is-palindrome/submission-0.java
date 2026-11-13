class Solution {
    public boolean isPalindrome(String s) {
        String normString = s.replaceAll("[^a-zA-Z0-9]", "");
        String lowerCaseString = normString.toLowerCase();
        int left = 0;
        int right = lowerCaseString.length() - 1;
        while (left < right){
            if (lowerCaseString.charAt(left) == lowerCaseString.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;

        
    }
}
