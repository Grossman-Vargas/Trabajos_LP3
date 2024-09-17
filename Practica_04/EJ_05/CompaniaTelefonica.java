package EJ_05;

public class CompaniaTelefonica {

    private String nombre;

    public CompaniaTelefonica(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre de la compania nulo.");
        }

        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Compañía: " + nombre ;
    }

}
