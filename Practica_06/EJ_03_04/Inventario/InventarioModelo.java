package Inventario;

import Inventario.Objetos.Weapon;
import Inventario.Objetos.Utilitie;

import java.util.*;

public class InventarioModelo {
    private List<Utilitie> items;

    public InventarioModelo(){
        items= new ArrayList<>();

    }

    public void AgregarItem(Utilitie ite){
        for(Utilitie i: items){
            if(i.getName().equals(ite.getName())){
                i.setCantidad(i.getCantidad()+1);
            }else{
                items.add(ite);
            }
        }
        
    }

    public List<Utilitie> getItems(){
        return items;
    }

    public boolean EliminarItem(String temp) {
        Iterator<Utilitie> iterator = items.iterator();

        while (iterator.hasNext()) {
            Utilitie i = iterator.next();
            
            if (temp.equals(i.getName())) {
                i.setCantidad(i.getCantidad() - 1);
                
                if (i.getCantidad() == 0) {
                    iterator.remove(); // Elimina el elemento de forma segura
                }
                
                return true; // Encontraste el ítem y lo modificaste, puedes salir del método
            }
        }
        
        return false; // No encontraste el ítem
    }
    

    public boolean usaritem(Utilitie it) {
        if (it instanceof Weapon) {
            return false;
        } else if (it.getCantidad() <= 0) {
            return false;
        } else {
            it.setCantidad(it.getCantidad()-1);
            return true;
        }
    }

    public Utilitie obtenerItem(String nombre) {
        int index = 0;
        for (Utilitie i : items) {
            if (nombre.equals(i.getName())) {
                return items.get(index);
            }
            index++;
        }
        // Si no se encuentra el item, devuelve null o lanza una excepción.
        return null;
    }
    
}
