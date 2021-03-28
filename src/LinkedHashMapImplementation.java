/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos (Sección 10)
 * HDT 6
 * Pedro Arriola (20188) y Maria Isabel Solano (20504)
 * 
 * -> LinkedHashMapImplementation.java
 * Archivo que contiene la implementación del 
 * LinkedHashMap.
 * 
 * @author MaIsabelSolano
 * @author unclepete-20
 */

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapImplementation<K,V> implements MapImplementation<K,V>{
    
    public LinkedHashMap<K,V> linkedHashMap; 

    public LinkedHashMapImplementation() {

        linkedHashMap = new LinkedHashMap<>();
    }


    
    /** 
     * @param key
     * @param object
     */
    @Override
    public void put(K key, V object) {
        linkedHashMap.put(key, object);
        
    }

    
    /** 
     * @param key
     */
    @Override
    public void remove(K key) {
        linkedHashMap.remove(key);
        
    }

    
    /** 
     * @return Set<K>
     */
    @Override
    public Set<K> keySet() {
        
        return linkedHashMap.keySet();
    }

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean containsValue(V o) {
        
        return linkedHashMap.containsValue(o);
    }

    
    /** 
     * @param key
     * @return V
     */
    @Override
    public V get(K key) {
        
        return linkedHashMap.get(key);
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        
        return linkedHashMap.isEmpty();
    }

    
    /** 
     * @param key
     * @param object
     */
    @Override
    public void replace(K key, V object) {
        linkedHashMap.replace(key, object);
        
    }

    
    /** 
     * @return int
     */
    @Override
    public int size() {
        
        return linkedHashMap.size();
    }

    
    /** 
     * @param key
     * @return boolean
     */
    @Override
    public boolean containsKey(K key) {
        
        return linkedHashMap.containsKey(key);
    }

    
    /** 
     * @return Collection<V>
     */
    @Override
    public Collection<V> values() {
        
        return linkedHashMap.values();
    }

   
}
