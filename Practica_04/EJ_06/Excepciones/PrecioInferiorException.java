package EJ_06.Excepciones;

public class PrecioInferiorException extends IllegalArgumentException {

    public PrecioInferiorException() {}

    public PrecioInferiorException(String mensaje) {
        super(mensaje);
    }

}