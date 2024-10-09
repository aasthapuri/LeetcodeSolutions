class LRUCache {
    Map<Integer,Integer> map;
    Deque<Integer> q;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        q = new LinkedList<>();
    }
    
    public int get(int key) {
       if(!map.containsKey(key)){
           return -1;
       }
        q.remove(key);
        q.addLast(key);
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            q.remove(key);
            map.remove(key);
        }
        map.put(key,value);
        q.addLast(key);
        
        if(map.size()>capacity){
            int removed = q.pollFirst();
            map.remove(removed);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */