package cuartos;

public class HabitacionEconomica extends HabitacionNormal {

    public HabitacionEconomica() {
        super("ECO123", 100.0, true);
    }

    @Override
    public void registrarHabitacion() {
        System.out.println("Habitación Económica registrada.");
    }

}
