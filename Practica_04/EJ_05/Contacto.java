package EJ_05;

public class Contacto {

    protected String nombre;
    protected Telefono telefono;

    public Contacto(String nombre, Telefono telefono) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre sin valor.");
        }

        if (telefono == null) {
            throw new IllegalArgumentException("Teléfono no puede ser nulo.");
        }

        this.nombre = nombre;
        this.telefono = telefono;

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

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        if (telefono == null) {
            throw new IllegalArgumentException("Teléfono no puede ser nulo.");
        }
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", " + telefono;
    }
}
