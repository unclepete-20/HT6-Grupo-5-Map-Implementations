/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos (Sección 10)
 * HDT 6
 * Pedro Arriola (20188) y Maria Isabel Solano (20504)
 * 
 * -> Factory.java
 * Archivo que implementa el patrón Factory de las diferentes
 * implementaciones del ADT Map.
 * 
 * @author MaIsabelSolano
 * @author unclepete-20
 */

public class Factory<K,V> {

    
    /** 
     * @param tipo
     * @return MapImplementation<K, V>
     */
    public MapImplementation<K,V> MetodoFactory(String tipo){
        if (tipo.equals("HM")){
            //Se crea un HashMap
            return new HashMapImplementation<K,V>();
        }

        else if (tipo.equals("TM")){
            //Se crea un TreeMap
            return new TreeMapImplementation<K,V>();
        }

        else if (tipo.equals("LHM")){
            //Se crea una linkedHashMap
            return new LinkedHashMapImplementation<K,V>();
        }

        if (tipo == null || tipo.isEmpty()){
            return null;
        }
        return null;
    }
}
