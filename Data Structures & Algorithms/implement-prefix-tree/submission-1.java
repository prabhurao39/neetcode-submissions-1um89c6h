class PrefixTree {
    static class Node {
        Map<Character, Node> map = new HashMap<>();
        public Node() {}
        boolean isEnd = false;
    }
    
    Node root = null;
    public PrefixTree() {
        root = new Node();
    }

    // trie
    public void insert(String word) {
        char[] ch =word.toCharArray();
        Node temp = root;
        for (char c : ch) {
            temp.map.putIfAbsent(c, new Node());
            temp = temp.map.get(c);
        }
        temp.isEnd = true;
    }

    public boolean search(String word) {
        Node temp = root;
        for (char c : word.toCharArray()) {
            if (!temp.map.containsKey(c)){
                return false;
            } else {
                temp = temp.map.get(c);
            }
        }

        return temp.isEnd;
    }

    public boolean startsWith(String prefix) {
        Node temp = root;
        for (char c : prefix.toCharArray()) {
            if (!temp.map.containsKey(c)){
                return false;
            } else {
                temp = temp.map.get(c);
            }
        }
        
        return true;
    }
}
