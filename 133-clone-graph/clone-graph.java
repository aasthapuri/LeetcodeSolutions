/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Integer,Node> map;
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        map = new HashMap<>();
        return dfs(node);
    }

    public Node dfs(Node node){
        // if(node==null) return null;

        if(map.containsKey(node.val)){
            return map.get(node.val);
        }

        Node current = new Node(node.val);
        map.put(node.val,current);

        for(Node n : node.neighbors){
            current.neighbors.add(dfs(n));
        }

        return current;
    }
}