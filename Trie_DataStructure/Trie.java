package com.rohit.Trie_DataStructure;

public class Trie {
//    Trie data structure is a tree-like data structure used for storing a dynamic set of strings.
//    It is commonly used for efficient retrieval and storage of keys in a large dataset.
//    The structure supports operations such as insertion, search, and deletion of keys.

     class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i = 0 ; i < 26 ; i++){
                children[i] = null;
            }
            eow = false;
        }

    }

    Node root;

    public Trie(){
        this.root = new Node();
    }

    public void insert(String word){
        insert(word,root);
    }

    private void insert(String word , Node root){
        Node node = root;
        for(int i = 0 ; i < word.length() ; i++){
            int idx = word.charAt(i) - 'a';
            if(node.children[idx] == null){
                node.children[idx] = new Node();
            }
            if(i == word.length()-1){
                node.children[idx].eow = true;
            }
            node = node.children[idx];
        }
    }

    public boolean search(String key ){
        return search(key,root);
    }

    private boolean search(String key , Node root){
        Node node = root;
        for(int i = 0 ; i < key.length() ; i++){
            int idx = key.charAt(i) - 'a';
            Node check = node.children[idx];

            if( check == null){
                return false;
            }
            if(i == key.length() - 1 && check.eow == false ){
                return false;
            }
            node = node.children[idx];
        }

        return true;
    }

    // practice qn1 work break problem
    public boolean wordBreak(String key){
        return wordBreak(root,key);
    }

    private boolean wordBreak(Node root, String key){
        if(key.length() == 0){
            return true;
        }
        for(int i = 1 ; i <= key.length() ; i++){
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);

            if(search(firstPart) && wordBreak(root,secondPart)){
                return true;
            }

        }
        return false;
    }

    //start with problem
    // create a function boolean startwith(string prefix) for trie.returns true if there is previously
    //inserted string word that has the prefix prefix and false otherwise.
    // words [] = {"apple","app","mango","man","woman"}
    // prefix = "app" output : true
    // prefix = "moon" output : false

    public boolean startsWith(String key){
        return startsWith(root,key);
    }

    private boolean startsWith(Node node , String prefix){
        Node curr = node;
        for(int i = 0 ; i < prefix.length() ; i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return  false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    //count unique subString
    public int countNode(){
        return countNode(root);
    }

    private int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count+1;
    }

    // longest word with all prefixes

    public static String ans = "";

    public String longestWord(StringBuilder temp){
        return longestWord(root,temp);
    }

    public String longestWord(Node root, StringBuilder temp){
        if(root == null){
            return "";
        }
        for(int i = 0 ; i < 26 ; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i+'a'));

                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String words[] = {"a" , "banana" , "app" , "appl" , "ap" , "apply" , "apple"};
        Trie t = new Trie();
        for(int i = 0 ; i < words.length ; i++){
            t.insert(words[i]);
        }
        StringBuilder temp = new StringBuilder("");
        System.out.println(t.longestWord(temp));

    }
}
