class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new TreeMap<>());
        }
        map.get(key).put(timestamp,value);
    } 
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        Map.Entry<Integer,String> e = map.get(key).floorEntry(timestamp);
        return e != null ? e.getValue() : "";
    }
}


/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */