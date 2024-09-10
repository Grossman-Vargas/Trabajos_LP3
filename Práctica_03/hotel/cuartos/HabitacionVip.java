package cuartos;

public class HabitacionVip extends HabitacionNormal {

    public HabitacionVip() {
        super("VIP123", 300.0, false);
    }

    @Override
    public void registrarHabitacion() {
        System.out.println("Habitación VIP registrada.");
    }

}
