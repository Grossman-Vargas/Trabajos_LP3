
package Inventario.Objetos;

public class Utilitie {

    protected String name;


    public Utilitie(String name) {

        this.name = name;

    }

    public String get_name(){
        return this.name;
    }

    public void usar(){
        System.out.println("Usas " + this.name + " pero no paso nada :v .");
    }


    @Override
    public String toString() {

        return this.name;

    }

}
