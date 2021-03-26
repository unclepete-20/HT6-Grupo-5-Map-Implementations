import java.util.*;

class Main{
    public static void main(String[] args){
        Factory factory = new Factory();
        Scanner scan = new Scanner(System.in);

        //inicio del programa
        int opcion = 0;
        pr("Bienvenido al programa");
        while (opcion != 5){
            try {


            }
            catch (InputMismatchException ime){
                pr("Ha ocurrido un error, el valor ingresado no es valido");
                scan.nextLine();

            }
        }
    }

    public static void pr (String a){
        System.out.println(a);
    }
}