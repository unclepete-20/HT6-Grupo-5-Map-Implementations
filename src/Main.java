import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args){

        //Instancias iniciales para asegurar funcionalidad del programa.
        Factory<String, String> factory = new Factory();
        Scanner scan = new Scanner(System.in);
        MapImplementation<String,String>coleccionCompletaCartas; 
        MapImplementation<String,String> coleccionUsuario;   

        //inicio del programa

        boolean ciclo_main = true;
        String implementation = "";


        while ( ciclo_main == true) {
            try {
            System.out.println("Elige la implementacion de Map que utilizaras\n");
            System.out.println("1) HashMap\n2) TreeMap\n3) LinkedHashMap\n");
            
            int option = scan.nextInt();


            switch (option){

                /**
                 * Opcion 1 Usara HashMap para guardar las colecciones de cartas.
                 */

                case 1: 
                implementation = "HM";
                ciclo_main = false;
                break;

                /**
                 * Opcion 2 Usara TreeMap para guardar las colecciones de cartas.
                 */

                case 2: 
                implementation = "TM";
                ciclo_main = false;
                break;

                /**
                 * Opcion 3 Usara LinkedHashMap para guardar las colecciones de cartas.
                 */

                case 3: 

                implementation = "LHM";
                ciclo_main = false;
                break;

                        
            }
            }catch (Exception e){
                System.out.println("Opcion invalida, elige una opcion existente\n");
            }

        }

        //Se ingresan las instancias de cualquiera de las implementaciones de Map escogidas por el usuario.
        coleccionCompletaCartas = factory.MetodoFactory(implementation);
        coleccionUsuario = factory.MetodoFactory(implementation);


        try {
            File myObj = new File("cards_desc.txt");
            Scanner fileScanner = new Scanner(myObj); //Se escanea el archivo para extraer la coleccion de las cartas.

            while (fileScanner.hasNextLine()) {

                String dato = fileScanner.nextLine();
                String nombre = dato.split("\\|")[0];
                String tipo = dato.split("\\|")[1];

                coleccionCompletaCartas.put(nombre, tipo); //Se ingresa la coleccion completa al Map.
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("\nError, no se ha podido escanear correctamente el archivo\n");
            e.printStackTrace();
        }

        boolean menu = true;

        while (menu) {

            System.out.println("\n______________________-----------------------------------______________________");
            System.out.println("______________________----------Coleccion de Cartas------" +
                "" +
                "---______________________");
            System.out.println("______________________-----------------------------------______________________\n\n");

            //Se muestran todas las opciones del menu.
            System.out.println("Ingrese la opcion para realizar la operacion que desea en la coleccion de cartas o la personal:\n\n");
            System.out.println("1) Agregar nueva carta a la coleccion personal\n");
            System.out.println("2) Mostrar el tipo de una carta específica\n");
            System.out.println("3) Mostrar el nombre, tipo y cantidad de cada carta en la coleccion personal\n");
            System.out.println("4) Mostrar el nombre, tipo y cantidad de cada carta en la coleccion personal ordenados por tipo\n");
            System.out.println("5) Mostrar el nombre y tipo de todas las cartas existentes\n");
            System.out.println("6) Mostrar el nombre y tipo de todas las cartas existentes ordenadas por tipo\n");
            System.out.println("7) Salir\n");

            int option = 0;

            boolean executing = true;

            while (executing) { //Verifica que la opcion elegida existe y tambien verifica que sea un valor numerico.
                try {
                    option = scan.nextInt();
                    
                    if (option > 7 || option < 1) {
                        System.out.println("\nOpcion invalida, ingrese una opcion existente.");
                    } else {
                        executing = false;
                    }
                } catch (Exception e) {
                    System.out.println("\nIngrese un valor numerico");
                }
            }

            

            switch (option) {


                case 1: //Agregar carta a coleccion personal.
                    System.out.println("\nIngrese el nombre de la carta que quiere agregar a su coleccion personal\n");

                    String cardName = scan.next();

                    if(coleccionCompletaCartas.containsKey(cardName)){
                        if(coleccionUsuario.containsKey(cardName)){

                            System.out.println("\nLa carta ya esta ingresada en su coleccion personal :)\n");

                        } else {
                            String type = coleccionCompletaCartas.get(cardName);

                            coleccionUsuario.put(cardName, type);

                        }

                    } else {
                        System.out.println("\nLa carta que quiere agregar a su coleccion no existe en la baraja principal.\n");
                    }
                    
                    break;


                case 2: //

                    break;


                case 3: //
                   
                   

                case 4: //Mostrar el nombre, tipo y cantidad de cada carta (Coleccion personal).

                    break;

                case 5: // Nombre y tipos de todas las cartas.

                    
                    break;

                case 6: //Nombre y tipos de todas las cartas ordenadas por tipo.

   

                    break;

                case 7: //Se cierra el programa.
                    System.out.println("\nCerrando el programa...\n");
                    scan.close();
                    menu = false;
                    break;

            }
        }

        

    }
}