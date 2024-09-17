package ACT_01.Excepciones;

public class SaldoInsuficienteException extends IllegalArgumentException {

  public SaldoInsuficienteException() {}

  public SaldoInsuficienteException(String mensaje) {
    super(mensaje);
  }

}