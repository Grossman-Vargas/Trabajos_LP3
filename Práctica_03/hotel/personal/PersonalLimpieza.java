package personal;

public class PersonalLimpieza implements Personal {

    private String nombre;
    private double precioCuarto = 50;
    private boolean asignado;
    private double salario;

    public PersonalLimpieza(String nombre) {

        this.nombre = nombre;
        this.asignado = false;
        this.salario = 0.0;

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void asignarTarea() {

        if (!asignado) {

            this.asignado = true;
            System.out.println("El personal de limpieza " + nombre + " ha sido asignado.");

        } else {

            System.out.println("El personal de limpieza " + nombre + " ya está asignado");

        }
    }

    @Override
    public void terminarTarea() {

        if (asignado) {

            this.asignado = false;
            System.out.println("El personal de limpieza " + nombre + " ha concluido la tarea");
            salario += precioCuarto;

        } else {

            System.out.println("El personal de limpieza " + nombre + " no está asignado");

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
        return "Personal de Limpieza: " + nombre + ", Salario actual: " + salario + ", Asignado: " + (asignado ? "Sí" : "No");
    }

}
