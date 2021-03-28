/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos (Sección 10)
 * HDT 6
 * Pedro Arriola (20188) y Maria Isabel Solano (20504)
 * 
 * -> HashMapImplementation.java
 * Archivo que contiene la implementación del 
 * HashMap.
 * 
 * @author MaIsabelSolano
 * @author unclepete-20
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapImplementation<K,V> implements MapImplementation<K,V>{
    
    public HashMap<K,V> hashMap;

    public HashMapImplementation() {

        hashMap = new HashMap<K,V>();
    }

    
    /** 
     * @param key
     * @param object
     */
    @Override
    public void put(K key, V object) {
        
        hashMap.put(key, object);
    }

    
    /** 
     * @param key
     */
    @Override
    public void remove(K key) {
        hashMap.remove(key);
        
    }

    
    /** 
     * @return Set<K>
     */
    @Override
    public Set<K> keySet() {
        
        return hashMap.keySet();
    }

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean containsValue(V o) {
        
        return hashMap.containsValue(o);
    }

    
    /** 
     * @param key
     * @return V
     */
    @Override
    public V get(K key) {
        
        return hashMap.get(key);
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        
        return hashMap.isEmpty();
    }

    
    /** 
     * @param key
     * @param object
     */
    @Override
    public void replace(K key, V object) {
        hashMap.replace(key, object);
    
    }

    
    /** 
     * @return int
     */
    @Override
    public int size() {
        
        return hashMap.size();
    }

    
    /** 
     * @param key
     * @return boolean
     */
    @Override
    public boolean containsKey(K key) {
        
        return hashMap.containsKey(key);
    }

    
    /** 
     * @return Collection<V>
     */
    @Override
    public Collection<V> values() {
        
        return hashMap.values();
    }

   
}
