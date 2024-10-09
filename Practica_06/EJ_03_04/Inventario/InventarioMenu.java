package Inventario;

public class InventarioMenu {

    String  menu = "Menu de Opciones del Inventario:";
    int cont = 1;

    public void agregar_funcion(String opcion){
        if (opcion != null || opcion.trim() != "" ){
            menu += "\n" +cont + ".- " + opcion;
        } else {
            System.out.println("No se pudo agregar la opcion");
        }
    }

    public int validar_opcion(int opcion){
        if (opcion <= cont && opcion > 0){
            return opcion;
        } else {
            System.out.println("Ingresar opción valida");
            return 0;
        }
    }

}
