/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos (Sección 10)
 * HDT 6
 * Pedro Arriola (20188) y Maria Isabel Solano (20504)
 * 
 * -> Main.java
 * Archivo principal de la hoja de trabajo, el cual contiene el
 * método main, que ejecuta todo el programa.
 * 
 * @author MaIsabelSolano
 * @author unclepete-20
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main{
    
    /** 
     * @param args
     */
    public static void main(String[] args){

        //Instancias iniciales para asegurar funcionalidad del programa.
        final Factory<String, String> factory = new Factory<String, String>();
        Scanner scan = new Scanner(System.in);
        final MapImplementation<String,String>coleccionCompletaCartas; 
        final MapImplementation<String,String> coleccionUsuario;   

        //inicio del programa

        boolean ciclo_main = true;
        String implementation = "";


        while (ciclo_main) {
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

        while(menu){

            System.out.println("\n////////////////////////////////// COLECCION DE CARTAS //////////////////////////////////\n");
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

            boolean answer = true;

            while (answer) {
                try {
                    option = scan.nextInt();
                    scan.nextLine();
                    if (option > 7 || option < 1) {
                        System.out.println("\nPor favor ingrese una opcion valida.");
                    } else {
                        answer = false;
                    }
                } catch (Exception e) {
                    System.out.println("\nPor favor ingrese un valor numerico.");
                    scan.nextInt();
                }
            }

            

            switch (option) {


                case 1: //Agregar carta a coleccion personal.

                    MapAdministrator.agregarCarta(coleccionCompletaCartas, coleccionUsuario);                    
                    break;


                case 2: //Mostrar el tipo de una carta específica

                    MapAdministrator.infoCarta(coleccionCompletaCartas);
                    break;


                case 3: //Mostrar el nombre, tipo y cantidad de cada carta en la coleccion personal

                    MapAdministrator.info(coleccionUsuario);
                    MapAdministrator.count(coleccionUsuario);
                
                    break;

                case 4: //Mostrar el nombre, tipo y cantidad de cada carta (Coleccion personal) ordenadas por tipo.

                    MapAdministrator.sort(coleccionUsuario);
                    MapAdministrator.count(coleccionUsuario);
                    break;

                case 5: // Nombre y tipos de todas las cartas.

                    MapAdministrator.info(coleccionCompletaCartas);
                    
                    break;

                case 6: //Nombre y tipos de todas las cartas ordenadas por tipo.

                    MapAdministrator.sort(coleccionCompletaCartas);

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
