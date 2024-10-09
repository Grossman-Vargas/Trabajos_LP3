package Entidades;

import Inventario.Objetos.Utilitie;
import Inventario.Objetos.Weapon;
import java.util.ArrayList;
import java.util.List;

public class Entity {
    protected String name;
    protected double salud;
    protected int nivel;

    public Entity(String name, double salud, int nivel) {

        this.name = name;
        this.salud = salud;
        this.nivel = nivel;

    }

    public void recibirDMG(double DMG){
        this.salud -= DMG;
    }

}
