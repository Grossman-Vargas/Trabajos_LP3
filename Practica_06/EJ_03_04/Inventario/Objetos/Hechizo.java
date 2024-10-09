
package Inventario.Objetos;

public class Hechizo extends Utilitie {

    protected boolean heal;
    protected double heal_stat;
    protected double dmg_stat;
    protected String name;

    public Hechizo(String name, boolean heal, double stat) {
        super(name);
        this.heal = heal;

        if (this.heal){
            this.heal_stat = stat;
        } else {
            this.dmg_stat = stat;
        }

    }

    public double get_stat(){
        if (this.heal){
            return this.heal_stat;
        } else {
            return this.dmg_stat;
        }
    }

    @Override
    public String toString() {

        return String.format("Nombre del hechizo -> %s\n ", name,
                            (heal ? "Curación -> " : "Daño -> "),
                            (heal ? heal_stat : dmg_stat));

    }

}
