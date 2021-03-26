public class Factory<K,V> {

    public Map MetodoFactory(String tipo){
        if (tipo.equals("HM")){
            //Se crea un HashMap
            return new HashMap();
        }

        else if (tipo.equals("TM")){
            //Se crea un TreeMap
            return new TreeMap();
        }

        else if (tipo.equals("LHM")){
            //Se crea un alinkedHashMap
            return new LinkedHashMap();
        }

        if (tipo == null||tipo.isEmpty()){
            return null;
        }
        return null;
    }
}
