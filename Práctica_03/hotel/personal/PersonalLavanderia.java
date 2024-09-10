package personal;

public class PersonalLavanderia implements Personal {

    private String nombre;
    private double salario;
    private boolean asignado;

    public PersonalLavanderia(String nombre) {

        this.nombre = nombre;
        this.salario = 0.0;
        this.asignado = false;

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void asignarTarea() {

        if (!asignado) {

            this.asignado = true;
            System.out.println("El personal de lavandería " + nombre + " ha sido asignado.");

        } else {

            System.out.println("El personal de lavandería " + nombre + " ya está asignado");

        }

    }

    @Override
    public void terminarTarea() {

        if (asignado) {

            this.asignado = false;
            System.out.println("El personal de lavandería " + nombre + " ha concluido la tarea");
            salario += 50;

        } else {

            System.out.println("El personal de lavandería " + nombre + " no está asignado");

        }
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public boolean isAsignado() {
        return asignado;
    }

    @Override
    public String toString() {
        return "Personal de Lavandería: " + nombre + ", Salario actual: " + salario + ", Asignado: " + (asignado ? "Sí" : "No");
    }

}
