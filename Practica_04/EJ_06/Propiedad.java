package EJ_06;

import EJ_06.Excepciones.DatoInvalidoException;

public class Propiedad {

    private String direccion;
    private double precio;
    private double tamaño;

    public Propiedad(String direccion, double precio, double tamaño){
        if (precio <= 0) {

            throw new DatoInvalidoException("Precio Negativo :v .");

        }

        if (tamaño <= 0) {

            throw new DatoInvalidoException("Tamaño Negativo :v .");

        }

        this.direccion = direccion;
        this.precio = precio;
        this.tamaño = tamaño;

    }

    public String getDireccion() {

        return direccion;

    }

    public double getPrecio() {

        return precio;

    }

    public double getTamaño() {

        return tamaño;

    }

    @Override
    public String toString() {
        return "Dirección: " + direccion + ", Precio: s/" + precio + ", Tamaño: " + tamaño + " metros^2";
    }

}
