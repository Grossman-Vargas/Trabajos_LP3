
package Entidades;
import Inventario.Objetos.Utilitie;
import Inventario.Objetos.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Enemigo extends Entity {
    protected String nombre;
    protected int vida;
    protected int nivel;
    protected Weapon arma;
    private Random rand = new Random();

    public Enemigo(String name, double salud, int nivel) {
        super(name, salud, nivel);
        this.arma = null;
    }

    public int get_vida(){
        return vida;
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

    public void nohacernada() {
        System.out.println(super.name + " no hace nada.");
    }

    public void posar() {
        System.out.println(super.name + " posa y tampoco hace nada.");
    }

    public void accionar(Entity e1) {
        int accion = rand.nextInt(3);
        if (accion == 0) {
            nohacernada();
        } else { if (accion == 1) {
            atacar(e1);
        } else {
            posar();
        }
    }
}


}



