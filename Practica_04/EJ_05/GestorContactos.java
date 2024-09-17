package EJ_05;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class GestorContactos {

    private List<Contacto> contactos;

    public GestorContactos() {

        contactos = new ArrayList<>();

    }

    public void agregarContacto(Contacto contacto) {

        System.out.println("Contacto agregado con exito -> " + contacto.getNombre());
        contactos.add(contacto);

    }

    public Contacto buscarContacto(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Buscando un contacto nulo xd.");
        }

        for (Contacto contacto : contactos) {

            if (nombre.equals(contacto.getNombre())) {
                return contacto;
            }

        }

        throw new NoSuchElementException("Contacto no encontrado.");

    }

    public void modificarContacto(String nombre, String nuevo_nombre, Telefono tel) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre del contacto nulo xd.");
        }

        Contacto contacto = buscarContacto(nombre);
        contacto.setNombre(nuevo_nombre);
        contacto.setTelefono(tel);

    }

    public void eliminarContacto(String nombre) {

        Contacto contacto = buscarContacto(nombre);
        contactos.remove(contacto);

    }

    public void get_Contactos() {

        if (contactos.isEmpty()) {

            System.out.println("Sin contactos");
            return;

        }

        System.out.println("Listado de contactos");

        for (Contacto contacto : contactos) {

            System.out.println(contacto);

        }

    }

}

