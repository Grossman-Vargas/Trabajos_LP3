package EJ_05;

public class Telefono {

    private String numero;
    private CompaniaTelefonica compania;

    public Telefono(String numero, CompaniaTelefonica compania) {

        if (numero == null || numero.isEmpty() || numero.length() != 10) {
            throw new IllegalArgumentException("Número de telefono no valido.");
        }

        if (compania == null) {
            throw new IllegalArgumentException("Compania telefonica nulo.");
        }

        this.numero = numero;
        this.compania = compania;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {

        if (numero == null || numero.isEmpty() || numero.length() != 10) {
            throw new IllegalArgumentException("Numero de telefono no valido.");
        }

        this.numero = numero;

    }

    public CompaniaTelefonica getCompania() {
        return compania;
    }

    @Override
    public String toString() {
        return "Número: " + numero + ", " + compania;
    }

}
