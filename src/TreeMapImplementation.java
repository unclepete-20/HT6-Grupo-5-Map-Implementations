import java.util.TreeMap;
import java.util.Collection;
import java.util.Set;

public class TreeMapImplementation<K,V> implements MapImplementation<K,V>{
    
    public TreeMap<K,V> treeMap;

    public TreeMapImplementation() {
        super();
        treeMap = new TreeMap<K,V>();
    }

    @Override
    public void put(K key, V object) {
        
        treeMap.put(key, object);
        
    }

    @Override
    public void remove(K key) {
        
        treeMap.remove(key);
        
    }

    @Override
    public Set<K> keySet() {
        
        return treeMap.keySet();
    }

    @Override
    public boolean containsValue(V o) {
        
        return treeMap.containsValue(o);
    }

    @Override
    public V get(K key) {
        
        return treeMap.get(key);
    }

    @Override
    public boolean isEmpty() {
        
        return treeMap.isEmpty();
    }

    @Override
    public void replace(K key, V object) {
        treeMap.replace(key, object);
        
    }

    @Override
    public int size() {
        
        return treeMap.size();
    }

    @Override
    public boolean containsKey(K key) {
        
        return treeMap.containsKey(key);
    }

    @Override
    public Collection<V> values() {
        
        return treeMap.values();
    }

   
}
