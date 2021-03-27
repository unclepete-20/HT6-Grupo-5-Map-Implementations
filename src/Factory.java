public class Factory<K,V> {

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

        if (tipo == null||tipo.isEmpty()){
            return null;
        }
        return null;
    }
}
