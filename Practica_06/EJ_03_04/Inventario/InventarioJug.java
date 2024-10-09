
package Inventario;
import Inventario.Objetos.Utilitie;

import java.util.List;
import java.util.ArrayList;

public class InventarioJug {

    protected List<Utilitie> inventario = new ArrayList();

    public void agregarInventario(Utilitie elemento) {
        System.out.println("Se agregó al inventario:\n " + elemento);
        this.inventario.add(elemento);
    }

    public void eliminarInventario(Utilitie elemento) {
        if (inventario.size() == 0){
            System.out.println("No hay elementos en el inventario");
            return;
        }
        try{
            this.inventario.remove(elemento);
        } catch (Exception e){
            System.out.println("No se pudo eliminar del inventario");
        }

    }

    public void imprimirInventario() {
        if (inventario.size() == 0){
            System.out.println("No hay elementos en el inventario");
            return;
        }
        System.out.println("Inventario:");

        for (Utilitie elemento : inventario) {
            System.out.println(elemento);
        }

    }

    public Utilitie buscarInventario(String name) {

        if (inventario.size() == 0){
            System.out.println("No hay elementos en el inventario");
            return null;
        }

        for (Utilitie e1 : inventario) {
            if (e1.get_name() == name) {
                System.out.println("Se encontró el elemento.");
                return e1;
            }
        }

        System.out.println("No se encontro en el inventario");
        return null;
    }

}
