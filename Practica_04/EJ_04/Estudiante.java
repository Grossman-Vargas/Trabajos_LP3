package EJ_04;

public class Estudiante {

    private String nombre;

    public Estudiante(String nombre) {

        if (nombre == null || nombre.isEmpty()) {

            throw new IllegalArgumentException("Nombre sin valor.");

        }

        this.nombre = nombre;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isEmpty()) {

            throw new IllegalArgumentException("Nombre sin valor.");

        }

        this.nombre = nombre;

    }

}
