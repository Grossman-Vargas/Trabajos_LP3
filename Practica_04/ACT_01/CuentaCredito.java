package ACT_01;

import ACT_01.Excepciones.CuentaCerradaException;
import ACT_01.Excepciones.CuentaNoEncontradaException;
import ACT_01.Excepciones.LimiteCreditoExcedidoException;
import ACT_01.Excepciones.SaldoNoCeroException;

class CuentaCredito extends CuentaBancaria {

    protected String NCuenta;
    protected String titular;
    protected double saldo;
    protected double limite;
    protected boolean estado = true;

    public CuentaCredito(String cuenta, String titular, double saldo, double limite) {
        super(cuenta,titular,saldo);
        this.limite = limite;
    }

    public void validar_cuenta() {
        try {
            if (estado == false) {
                throw new CuentaCerradaException("Cuenta inaccesible.");
            }
        } catch (CuentaCerradaException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void retirar(double monto) {
        validar_cuenta();
        try {
            if ((saldo - monto) < limite ) {
                throw new LimiteCreditoExcedidoException("El límite del crédito ha sido superado.");
            } else {
                saldo -= monto;
            }
        } catch (LimiteCreditoExcedidoException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void depositar(double monto) {
        validar_cuenta();
        try {
            if (monto <= 0) {
                throw new IllegalArgumentException("Monto negativo.");
            } else {
                saldo += monto;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void transferir(CuentaBancaria destino, double monto) {
        validar_cuenta();
        try {
            if (destino == null) {
                throw new CuentaNoEncontradaException("Cuenta no encontrada.");
            }
            destino.depositar(monto);
            retirar(monto);
            System.out.println("Monto despositado correctamente.");

        }catch (CuentaNoEncontradaException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    public void cerrarCuenta() {
        validar_cuenta();
        try {
            if(saldo != 0) {
                throw new SaldoNoCeroException("El saldo no es cero, inborrable.");
            } else {
                System.out.println("Cuenta cerrada.");
                estado = false;
            }
        } catch (SaldoNoCeroException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }

    }

}