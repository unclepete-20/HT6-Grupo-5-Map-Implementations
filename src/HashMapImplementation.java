import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapImplementation<K,V> implements MapImplementation<K,V>{
    
    public HashMap<K,V> hashMap;

    public HashMapImplementation() {
        super();
        hashMap = new HashMap<K,V>();
    }

    @Override
    public void put(K key, V object) {
        
        hashMap.put(key, object);
    }

    @Override
    public void remove(K key) {
        hashMap.remove(key);
        
    }

    @Override
    public Set<K> keySet() {
        
        return hashMap.keySet();
    }

    @Override
    public boolean containsValue(V o) {
        
        return hashMap.containsValue(o);
    }

    @Override
    public V get(K key) {
        
        return hashMap.get(key);
    }

    @Override
    public boolean isEmpty() {
        
        return hashMap.isEmpty();
    }

    @Override
    public void replace(K key, V object) {
        hashMap.replace(key, object);
    
    }

    @Override
    public int size() {
        
        return hashMap.size();
    }

    @Override
    public boolean containsKey(K key) {
        
        return hashMap.containsKey(key);
    }

    @Override
    public Collection<V> values() {
        
        return hashMap.values();
    }

   
}
