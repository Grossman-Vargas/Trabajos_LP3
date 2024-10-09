
package Entidades;
import Inventario.Objetos.Utilitie;
import Inventario.Objetos.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends Entity {
    protected String nombre;
    protected int vida;
    protected int nivel;
    protected List<Utilitie> inventario = new ArrayList<>();
    protected Weapon arma;

    public Jugador(String name, double salud, int nivel) {
        super(name, salud, nivel);
        this.arma = null;
    }

    public void isAlive(){

        if(vida <= 0){

            System.out.println("El jugador " + nombre + " ha muerto.");
            System.exit(0);

        } else {

            System.out.println("Vida actual del jugador " + nombre + " -> " + vida);

        }

    }

    public double atacar(Entity e1) {
        if(arma == null){
            System.out.println("Se realizo un ataque de " + nivel *035);
            e1.recibirDMG(nivel * 0.5);
        } else {
            e1.recibirDMG(arma.get_DMG());
        }
    }

    // Implementación del método recibirDaño
    @Override
    public void recibirDaño(NPC enemigo) {
        salud = salud - enemigo.atacar();
    }

    public boolean SubirNivel(){
        if(experiencia>expT){
            nivel++;
            experiencia-=expT;
            expT*=1.2;
            return true;
        }else{
            return false;
        }
    }

    // Método para aumentar la experiencia
    public void ganarExperiencia(int exp) {
        this.experiencia += exp;
    }
}
