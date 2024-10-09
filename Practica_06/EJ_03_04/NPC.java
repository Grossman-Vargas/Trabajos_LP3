import Inventario.Objetos.Weapon;

public class NPC {
    protected String name;
    protected double salud;
    protected int nivel;
    protected Weapon weapon;  // Agregado el atributo arma

    // Constructor
    public NPC(String name, double salud, int nivel) {
        this.name = name;
        this.salud = salud;
        this.nivel = nivel;
    }

    // Métodos de acceso (getters y setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Weapon getArma() {   // Getter para el atributo arma
        return weapon;
    }

    public void setArma(Weapon weapon) {   // Setter para el atributo arma
        this.weapon = weapon;
    }

    public double atacar() {
        return weapon.getDamage();
    }
    public void recibirDaño(NPC enemy){
        salud= salud - enemy.atacar();
    }
}
