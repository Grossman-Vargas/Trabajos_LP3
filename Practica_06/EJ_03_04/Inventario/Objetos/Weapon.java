
package Inventario.Objetos;
import Inventario.Objetos.Utilitie;
import java.util.Random;

public class Weapon implements Utilitie {

    protected String name;
    protected boolean is_legendary;
    protected double dmg_stat;
    Random rand = new Random();

    public Weapon(String name, boolean is_legendary, double stat) {

        this.name = name;
        this.is_legendary = is_legendary;
        this.dmg_stat = stat;

    }

    @Override
    public String get_name(){
        return this.name;
    }

    @Override
    public double get_DMG(){
        if(this.is_legendary){
            return this.dmg_stat += rand.nextDouble(5) + 1;
        }
        return this.dmg_stat;
    }

    @Override
    public double get_HEAL(){
        return 0;
    }

    @Override
    public String toString() {

        return String.format("Nombre del arma -> %s\n ", name,
                (is_legendary ? "Es legendaria (daño incrementado) -> " : "NO Es legendaria -> "),
                (get_DMG()));

    }

}
