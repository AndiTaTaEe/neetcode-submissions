class Solution {
    public int lengthOfLastWord(String s) {
        String noSpacesString = s.trim();
        int count = 0;
        for (int i = noSpacesString.length() - 1; i >= 0; i--){
            if (noSpacesString.charAt(i) != ' '){
                count++;
            } else {
                break;
            }
        }
        return count;
        
    }
}