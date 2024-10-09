
package Inventario.Objetos;

public class Hechizo implements Utilitie {

    protected boolean heal;
    protected double heal_stat;
    protected double dmg_stat;
    protected String name;

    public Hechizo(String name, boolean heal, double stat) {
        this.name = name;
        this.heal = heal;

        if (this.heal){
            this.heal_stat = stat;
        } else {
            this.dmg_stat = stat;
        }

    }

    @Override
    public String get_name(){
        return this.name;
    }

    @Override
    public double get_DMG(){
        return this.dmg_stat;
    }

    @Override
    public double get_HEAL(){
        return this.heal_stat;
    }

    @Override
    public String toString() {

        return String.format("Nombre del hechizo -> %s\n ", name,
                            (heal ? "Curación -> " : "Daño -> "),
                            (heal ? heal_stat : dmg_stat));

    }

}
