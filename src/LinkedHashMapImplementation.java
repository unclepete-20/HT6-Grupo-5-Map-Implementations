import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapImplementation<K,V> implements MapImplementation<K,V>{
    
    public LinkedHashMap<K,V> linkedHashMap; 

    public LinkedHashMapImplementation() {
        super();
        linkedHashMap = new LinkedHashMap<>();
    }


    @Override
    public void put(K key, V object) {
        linkedHashMap.put(key, object);
        
    }

    @Override
    public void remove(K key) {
        linkedHashMap.remove(key);
        
    }

    @Override
    public Set<K> keySet() {
        
        return linkedHashMap.keySet();
    }

    @Override
    public boolean containsValue(V o) {
        
        return linkedHashMap.containsValue(o);
    }

    @Override
    public V get(K key) {
        
        return linkedHashMap.get(key);
    }

    @Override
    public boolean isEmpty() {
        
        return linkedHashMap.isEmpty();
    }

    @Override
    public void replace(K key, V object) {
        linkedHashMap.replace(key, object);
        
    }

    @Override
    public int size() {
        
        return linkedHashMap.size();
    }

    @Override
    public boolean containsKey(K key) {
        
        return linkedHashMap.containsKey(key);
    }

    @Override
    public Collection<V> values() {
        
        return linkedHashMap.values();
    }

   
}

