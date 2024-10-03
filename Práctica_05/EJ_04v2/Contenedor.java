package EJ_04v2;

import java.util.ArrayList;

public class Contenedor<F, S> {
    protected ArrayList<Par<F, S>> contenedor = new ArrayList<>();

    public Contenedor() {
    }

    public void agregarPar(F el1, S el2) {
        Par<F, S> obj = new Par<>(el1, el2);
        this.contenedor.add(obj);
    }

    public Par<F, S> obtenerPar(int indice) {
        if (indice >= 0 && indice < this.contenedor.size()) {
            return this.contenedor.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Indice invalido.");
        }
    }

    public ArrayList<Par<F, S>> getPares() {
        return this.contenedor;
    }

    public void mostrarPares() {
        for (Par<F, S> obj : this.contenedor) {
            System.out.println(obj);
        }
    }
}
