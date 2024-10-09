
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
    protected InventarioJug inventario;
    //protected List<Utilitie> inventario = new ArrayList<>();
    protected Weapon arma;

    public Jugador(String name, double salud, int nivel) {
        super(name, salud, nivel);
        this.arma = null;
    }

    public void atacar(Entity e1) {
        if (arma == null) {
            System.out.println("Se realizo un ataque de " + nivel * 035);
            e1.recibirDMG(nivel * 0.5);
            e1.isAlive();
        } else {
            e1.recibirDMG(arma.get_DMG());
            e1.isAlive();
        }
    }

    public InventarioJug getInventario() {
        return inventario;
    }

}



