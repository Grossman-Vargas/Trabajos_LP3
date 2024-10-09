package Inventario;
import java.util.Scanner;

public class InventarioMenu {

    String  menu = "Menu de Opciones del Inventario:";
    int cont = 1;
    Scanner sc = new Scanner(System.in);

    public void agregar_funcion(String opcion){
        if (opcion != null || opcion.trim() != "" ){
            menu += "\n" +cont + ".- " + opcion;
        } else {
            System.out.println("No se pudo agregar la opcion");
        }
    }

    public int validar_opcion(){
        int opcion = sc.nextInt();
        if (opcion <= cont && opcion > 0){
            return opcion;
        } else {
            System.out.println("Ingresar opción valida");
            return 0;
        }
    }

    @Override
    public String toString() {
        return menu;
    }

}
