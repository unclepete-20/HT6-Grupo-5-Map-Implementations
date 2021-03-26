import java.util.Set;

public class LinkedHashMap<K,V> implements Map{
    LinkedHashMap<K,V> linkedHashMap = new LinkedHashMap<>();
    public LinkedHashMap() {

    }

    @Override
    public int size() {
        return linkedHashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return linkedHashMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return linkedHashMap.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return linkedHashMap.containsValue(o);
    }

    @Override
    public Object get(Object o) {
        return linkedHashMap.get(o);
    }

    @Override
    public Object put(Object o, Object o2) {
        return linkedHashMap.put(o,o2);
    }

    @Override
    public Object remove(Object o) {
        return linkedHashMap.remove(o);
    }

    @Override
    public void putAll(Map other) {
        linkedHashMap.putAll(other);
    }

    @Override
    public void clear() {
        linkedHashMap.clear();
    }

    @Override
    public Set keySet() {
        return linkedHashMap.keySet();
    }
}
