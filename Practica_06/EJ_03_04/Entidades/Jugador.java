
package Entidades;
import Inventario.InventarioJug;
import Inventario.Objetos.Utilitie;
import Inventario.Objetos.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends Entity {
    protected String nombre;
    protected int vida;
    protected int nivel;
    protected InventarioJug inventario = new InventarioJug();
    //protected List<Utilitie> inventario = new ArrayList<>();
    protected Weapon arma;

    public Jugador(String name, double salud, int nivel) {
        super(name, salud, nivel);
        this.arma = null;
    }

    public void atacar(Entity e1) {
        if (arma == null) {
            System.out.println("Se realizo un ataque de " + super.nivel * 10);
            e1.recibirDMG(super.nivel * 10);
            e1.isAlive();
        } else {
            e1.recibirDMG(arma.get_DMG());
            e1.isAlive();
        }
    }

    public int get_vida(){
        return vida;
    }

    public void agregar_Weapon(Weapon arma){
        if (arma == null) {
            System.out.println("Se adhirio un nueva arma:\n" + arma);
        } else {
            System.out.println("El arma actual fue reemplazada -");
            inventario.agregarInventario(this.arma);
        }
        this.arma = arma;
        inventario.eliminarInventario(arma);
    }

    public void quitar_Weapon(){
        if(arma == null){
            System.out.println("Arma en nulo");
        } else {

            inventario.agregarInventario(arma);
            this.arma = null;

        }
    }

    public InventarioJug getInventario() {
        return inventario;
    }

    public void curarse(int stat){
        this.salud += stat;
    }

}



