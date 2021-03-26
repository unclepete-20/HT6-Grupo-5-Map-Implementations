import java.util.Set;

public class HashMap<K,V> implements Map{
    HashMap<K,V> hashMap = new HashMap<>();

    public HashMap() {
        super();
    }

    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return hashMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return hashMap.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return hashMap.containsValue(o);
    }

    @Override
    public Object get(Object o) {
        return hashMap.get(o);
    }

    @Override
    public Object put(Object o, Object o2) {
        return hashMap.put(o,o2);
    }

    @Override
    public Object remove(Object o) {
        return hashMap.remove(o);
    }

    @Override
    public void putAll(Map other) {
        hashMap.putAll(other);
    }

    @Override
    public void clear() {
        hashMap.clear();
    }

    @Override
    public Set keySet() {
        return hashMap.keySet();
    }
}
