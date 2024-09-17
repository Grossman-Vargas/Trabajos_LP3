package EJ_05;

public class Main_05 {

    public static void main(String[] args) {

        CompaniaTelefonica C1 = new CompaniaTelefonica("Movistar");
        CompaniaTelefonica C2 = new CompaniaTelefonica("Claro");

        Telefono T1 = new Telefono("1234567890", C1);
        Telefono T2 = new Telefono("0987654321", C2);

        Contacto Con1 = new Contacto("Grossman Vargas", T1);
        Contacto Con2 = new Contacto("Joaquin Loaiza", T2);

        GestorContactos gestor = new GestorContactos();

        gestor.agregarContacto(Con1);
        gestor.agregarContacto(Con2);

        System.out.println("Antes:");
        gestor.get_Contactos();

        Telefono nuevoTelefono = new Telefono("1122334455", C2);
        gestor.modificarContacto("Grossman Vargas", "Waos", nuevoTelefono);

        System.out.println("\nDespues:");
        gestor.get_Contactos();

        gestor.eliminarContacto("Waos");

        System.out.println("\nDespues del despues:");
        gestor.get_Contactos();

    }

}
