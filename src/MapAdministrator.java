/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos (Sección 10)
 * HDT 6
 * Pedro Arriola (20188) y Maria Isabel Solano (20504)
 * 
 * -> MapAdministrator.java
 * Archivo que administra las funcionalidades principales que
 * requiere la hoja de trabajo. Se encarga de realizar las operaciones
 * en los diferentes Maps.
 * 
 * @author MaIsabelSolano
 * @author unclepete-20
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapAdministrator {

    static Scanner scanner = new Scanner(System.in);
    
    
    /** 
     * @param coleccion
     * @param scanner.nextLine();if(coleccion.containsKey(cardName)
     */
    public static void agregarCarta(MapImplementation<String,String> coleccion, MapImplementation<String,String> personal){ //Agrega una carta a la coleccion personal del usuario.
        
        System.out.println("\nIngrese el nombre de la carta que quiere agregar a su coleccion personal\n");

        String cardName = scanner.nextLine();

        if(coleccion.containsKey(cardName)){
            if(personal.containsKey(cardName)){

                System.out.println("\nLa carta ya esta ingresada en su coleccion personal :)\n");

            } else {
               String type = coleccion.get(cardName);

                personal.put(cardName, type);

                System.out.println("\nLa carta ha sido agregada con exito a su coleccion personal\n");

            }

        } else {

            System.out.println("\nLa carta que quiere agregar a su coleccion no existe en la baraja principal.\n");
        }
                    
        
    }

    
    /** 
     * @param coleccion
     */
    public static void infoCarta(MapImplementation<String,String> coleccion){ //Muestra el tipo de la carta que el usuario ingrese.
        System.out.println("\nIngrese el nombre de la carta para conocer su tipo\n");

        String cardName = scanner.nextLine();

        System.out.println(coleccion.get(cardName));

        if(coleccion.containsKey(cardName)){
            String type = coleccion.get(cardName);

            System.out.println("\nNombre de la Carta: " + cardName + ", Tipo: " + type + "\n");

        } else {
            System.out.println("\nLa carta que ha ingresado no existe en la baraja principal\n");
        }
    }

    
    /** 
     * @param baraja
     */
    public static void count(MapImplementation<String,String> baraja){ //Hace un conteo de todas las cartas por tipo.

        int trampa = 0;
        int hechizo = 0;
        int monstruo = 0; 

        Set<String> keys = baraja.keySet();

        Iterator<String> keyIt = keys.iterator();
 
        if(baraja.isEmpty()){
            System.out.println("\nError, no hay cartas en la coleccion para mostrar\n");

        } else {

            while(keyIt.hasNext()){ //Comienza a iterar en el set de keys.
                
                String name = keyIt.next();
                String type = baraja.get(name);

                if(type.equals("Trampa")){
                    trampa++;

                } else if(type.equals("Hechizo")){
                    hechizo++;

                } else if(type.equals("Monstruo")){
                    monstruo++;

                }
                
            }    


            //Por ultimo se imprimen las cantidades.

            System.out.println("\n------------------------------------ CANTIDADES POR TIPO ------------------------------------\n");
            System.out.println("Trampa: " + trampa);
            System.out.println("Hechizo: " + hechizo);
            System.out.println("Monstruo: " + monstruo + "\n");

        }
    }

    
    /** 
     * @param coleccion
     */
    public static void sort(MapImplementation<String,String> coleccion){ //Realiza el ordenamiento de las cartas por tipo.
        String temp[];

        temp= new String[coleccion.size()];
        Set<String> k = coleccion.keySet();
        int x=0;
        for(String i : k) {
            temp[x]=(coleccion.get(i)+" "+i);
            x++;
        }

        int size = temp.length;  

        //Algoritmo de bubble sorting para el map implementado.   
        for(int i = size-1; i>0; i--) {
            
            for (int j = 0; j<i; j++) {  
                //Compara cada elemento de la lista con cada elemento restante en la lista para ordenarlo correctamente.
                if(temp[j].compareTo(temp[j+1])>0){  
                    //intercambia los valores para ordenarlos correctamente. 
                    String tempo = temp[j+1];  
                    temp[j+1] = temp[j];  
                    temp[j] = tempo;  
                }  
            }  
        }

        for(String card: temp) {
            System.out.println(card); //Imprime las cartas por tipo de forma ordenada.
        }

    }

    
    /** 
     * @param coleccion
     */
    public static void info(MapImplementation<String,String> coleccion){ //Muestra el nombre y tipo de las cartas que esten en el Map.
        
        Set<String> keys = coleccion.keySet();

        Iterator<String> keysIt = keys.iterator();

        if(coleccion.isEmpty()){

            System.out.println("\nError, no hay cartas en la coleccion para mostrar\n");

        } else {

            while(keysIt.hasNext()){ //Comienza a iterar en el set de keys.
                String name = keysIt.next();
                String type = coleccion.get(name);
                System.out.println("Nombre de la carta: " + name + ", Tipo: " + type);
            }
        }
    }
}
