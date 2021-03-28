/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos (Sección 10)
 * HDT 6
 * Pedro Arriola (20188) y Maria Isabel Solano (20504)
 * 
 * -> TreeMapImplementation.java
 * Archivo que contiene la implementación del 
 * TreeMap.
 * 
 * @author MaIsabelSolano
 * @author unclepete-20
 */

import java.util.TreeMap;
import java.util.Collection;
import java.util.Set;

public class TreeMapImplementation<K,V> implements MapImplementation<K,V>{
    
    public TreeMap<K,V> treeMap;

    public TreeMapImplementation() {

        treeMap = new TreeMap<K,V>();
    }

    
    /** 
     * @param key
     * @param object
     */
    @Override
    public void put(K key, V object) {
        
        treeMap.put(key, object);
        
    }

    
    /** 
     * @param key
     */
    @Override
    public void remove(K key) {
        
        treeMap.remove(key);
        
    }

    
    /** 
     * @return Set<K>
     */
    @Override
    public Set<K> keySet() {
        
        return treeMap.keySet();
    }

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean containsValue(V o) {
        
        return treeMap.containsValue(o);
    }

    
    /** 
     * @param key
     * @return V
     */
    @Override
    public V get(K key) {
        
        return treeMap.get(key);
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        
        return treeMap.isEmpty();
    }

    
    /** 
     * @param key
     * @param object
     */
    @Override
    public void replace(K key, V object) {
        treeMap.replace(key, object);
        
    }

    
    /** 
     * @return int
     */
    @Override
    public int size() {
        
        return treeMap.size();
    }

    
    /** 
     * @param key
     * @return boolean
     */
    @Override
    public boolean containsKey(K key) {
        
        return treeMap.containsKey(key);
    }

    
    /** 
     * @return Collection<V>
     */
    @Override
    public Collection<V> values() {
        
        return treeMap.values();
    }

   
}
