
package Inventario.Objetos;

public class Hechizo extends Utilitie {

    protected boolean heal;
    protected int heal_stat;
    protected int dmg_stat;
    protected String name;

    public Hechizo(String name, boolean heal, int stat) {
        super(name);
        this.heal = heal;

        if (this.heal){
            this.heal_stat = stat;
        } else {
            this.dmg_stat = stat;
        }

    }

    public boolean tipo(){
        return heal;
    }

    public int get_stat(){
        if (this.heal){
            return this.heal_stat;
        } else {
            return this.dmg_stat;
        }
    }

    @Override
    public String toString() {
        String tipo = heal ? "Curación -> " : "Daño -> ";
        double stat = heal ? heal_stat : dmg_stat;
        String nombre = super.toString();
        return "Nombre del hechizo -> " + nombre + "\n" + tipo + stat;
    }


}
