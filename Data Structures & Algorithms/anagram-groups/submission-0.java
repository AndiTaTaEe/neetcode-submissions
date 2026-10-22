class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>  result = new HashMap<>(); 
        for (String s : strs){
            int[] freq = new int[26]; // a-z frequency array
            for(char c: s.toCharArray()){
                freq[c-'a']++;
            }
            String key = Arrays.toString(freq); // converting the freq array into a string in order to map it
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(s);
        } 
        return new ArrayList<>(result.values());
        
    }
}
