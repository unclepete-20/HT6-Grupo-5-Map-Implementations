import java.util.Set;

public class TreeMap<K,V> implements Map{
    TreeMap<K,V> treeMap = new TreeMap<>();
    public TreeMap() {

    }

    @Override
    public int size() {
        return treeMap.size();
    }

    @Override
    public boolean isEmpty() {
        return treeMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return treeMap.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return treeMap.containsValue(o);
    }

    @Override
    public Object get(Object o) {
        return treeMap.get(o);
    }

    @Override
    public Object put(Object o, Object o2) {
        return treeMap.put(o,o2);
    }

    @Override
    public Object remove(Object o) {
        return treeMap.remove(o);
    }

    @Override
    public void putAll(Map other) {
        treeMap.putAll(other);
    }

    @Override
    public void clear() {
        treeMap.clear();
    }

    @Override
    public Set keySet() {
        return treeMap.keySet();
    }
}
