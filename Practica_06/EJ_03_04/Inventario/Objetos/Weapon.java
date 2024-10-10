
package Inventario.Objetos;
import Inventario.Objetos.Utilitie;
import java.util.Random;

public class Weapon extends Utilitie {

    protected String name;
    protected boolean is_legendary;
    protected double dmg_stat;
    Random rand = new Random();

    public Weapon(String name, double dmg_stat, boolean is_legendary) {
        super(name);
        this.dmg_stat = dmg_stat;
        this.is_legendary = is_legendary;
    }

    public double get_DMG(){
        if(this.is_legendary){
            return this.dmg_stat += rand.nextDouble(5) + 1;
        }
        return this.dmg_stat;
    }

    @Override
    public String toString() {
        String legendario = is_legendary ? "Es legendaria (daño incrementado) -> " : "NO Es legendaria -> ";
        String name = super.toString();
        return "Nombre del arma -> " + name + "\n" + legendario + get_DMG();
    }


}
