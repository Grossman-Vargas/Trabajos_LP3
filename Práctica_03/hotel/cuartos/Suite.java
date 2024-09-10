package cuartos;

public class Suite extends HabitacionNormal {

    public Suite() {
        super("SUI123", 500.0, false);
    }

    @Override
    public void registrarHabitacion() {
        System.out.println("Cuartos.Suite registrada.");
    }

}
