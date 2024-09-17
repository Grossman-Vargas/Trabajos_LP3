package EJ_06;

import EJ_06.Excepciones.PrecioInferiorException;

public class Transaccion {

    private int id;
    private Propiedad propiedad;
    private double precio;

    public Transaccion(int id, Propiedad propiedad, double precio) {

        if (precio < propiedad.getPrecio()) {

            throw new PrecioInferiorException("Transaccion invalida.");

        }

        this.id = id;
        this.propiedad = propiedad;
        this.precio = precio;

    }

    public int getId() {

        return id;

    }

    public Propiedad getPropiedad() {

        return propiedad;

    }

    public double getPrecio() {

        return precio;

    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + propiedad + ", Precio Transacción: s/" + precio;
    }

}
