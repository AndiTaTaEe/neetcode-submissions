class TrieNode {
    // array of child nodes
    TrieNode[] children;
    boolean isEndOfWord; // checks if the word has ended
    public TrieNode(){
        isEndOfWord = false;
        children = new TrieNode[26]; // indicating all lowercase English letters
    }
}
class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode();
    }
    public void insert(String key){
        TrieNode curr = root;
        for (char c: key.toCharArray()){
            if (curr.children[c-'a'] == null){
                curr.children[c-'a'] = new TrieNode();
            }
            curr = curr.children[c-'a'];
        }
        curr.isEndOfWord = true;
    }

    public String prefixSearch(String key){
        TrieNode curr = root;
        String prefix = "";
        for (char c : key.toCharArray()){
            int index = c - 'a';
            int childCount = 0;
            for (TrieNode child : curr.children) {
                if (child != null) childCount++;
            }
            if (childCount != 1 || curr.isEndOfWord) {
                break;
            }
            curr = curr.children[index];
            prefix += c;
        }
        return prefix;
    }
}



class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Trie trie = new Trie();
        for (int i = 0; i < strs.length; i++){
            trie.insert(strs[i]);
        }
        String prefix = trie.prefixSearch(strs[0]);
        return prefix;
    }
}