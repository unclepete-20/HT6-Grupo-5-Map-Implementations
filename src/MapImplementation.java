/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos (Sección 10)
 * HDT 6
 * Pedro Arriola (20188) y Maria Isabel Solano (20504)
 * 
 * -> MapImplementation.java
 * Interfaz del ADT Map que define los métodos más esenciales.
 * 
 * @author MaIsabelSolano
 * @author unclepete-20
 */

import java.util.Set;
import java.util.Collection;

public interface MapImplementation<K,V> {

    public void put(K key, V object);

    public void remove(K key);
    
    public Set<K> keySet();
    
    public boolean containsValue(V o);
    
    public V get(K key);
    
    public boolean isEmpty();
    
    public void replace(K key, V object);
    
    public int size();
    
    public boolean containsKey(K key);
    
    public Collection<V> values();
}
