class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> freq = new HashMap<>();

        // if the 2 strings are actual anagrams, the frequencies of the characters should result in 0 (if we have two 't's in string1 and same in string2, 2-2 = 0, else, it will be > 0)
        for (int i = 0; i < s.length(); i++){
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
            freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (int i : freq.values()) {
            if (i != 0){
                return false;
            }
        }
        return true;


    }
}
