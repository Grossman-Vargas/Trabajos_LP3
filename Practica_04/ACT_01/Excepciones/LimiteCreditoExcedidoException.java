package ACT_01.Excepciones;

public class LimiteCreditoExcedidoException extends IllegalArgumentException {

    public LimiteCreditoExcedidoException() {}

    public LimiteCreditoExcedidoException(String mensaje) {
        super(mensaje);
    }

}