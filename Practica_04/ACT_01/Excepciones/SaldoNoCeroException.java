package ACT_01.Excepciones;

public class SaldoNoCeroException extends IllegalArgumentException {

  public SaldoNoCeroException() {}

  public SaldoNoCeroException(String mensaje) {
    super(mensaje);
  }

}