class LRUCache {
    Deque<Integer> queue;
    HashMap<Integer,Integer> map = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        queue = new LinkedList<>();
        map = new HashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        queue.remove(key);
        queue.addLast(key);
        
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            queue.remove(key);
            map.remove(key);
        }
        map.put(key,value);
        queue.addLast(key);
        
        if(map.size()>capacity){
            int remove = queue.pollFirst();
            map.remove(remove);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */