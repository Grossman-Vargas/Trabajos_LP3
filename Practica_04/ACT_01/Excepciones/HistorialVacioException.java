package ACT_01.Excepciones;

public class HistorialVacioException extends Exception {

    public HistorialVacioException() {}

    public HistorialVacioException(String mensaje) {
        super(mensaje);
    }
}
