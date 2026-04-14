/**
 * Clase que representa una cuenta bancaria
 * @author ruben
 * @version 1.0
 */
public class Cuenta {
    private String numero;
    private float saldo;

    /**
     * Constructor de la clase Cuenta
     * @param numCta
     * @param saldoCta
     */
    // Constructor de la clase Cuenta
    public Cuenta(String numCta, float saldoCta) {
        // Número de la cuenta bancaria
        // Saldo de la cuenta bancaria en euros
        this.numero = numCta;
        this.saldo = saldoCta;
    }

    /**
     * Método para obtener el número de cuenta
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Método para obtener el saldo de la cuenta
     * @return
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Método para asignar el número de cuenta
     * @param numCta
     */
    public void setNumero(String numCta) {
        this.numero = numCta;
    }

    /**
     * Método para asignar el saldo de la cuenta
     * @param saldoCta
     */
    public void setSaldo(float saldoCta) {
        this.saldo = saldoCta;
    }

    /**
     * Método para ingresar dinero en la cuenta
     * @param importe
     */
    public void ingresarDinero(float importe) {
        this.saldo += importe;
    }

    /**
     * 
     * Método para extraer dinero de la cuenta
     * @param importe
     */
    public void extraerDinero(float importe) {
        if ((saldo - importe) < 0) {
            throw new java.lang.ArithmeticException("Saldo negativo");
        } else {
            saldo = saldo - importe;
        }
    }

    /**
     * Método para mostrar los datos de la cuenta
     */
    public void mostrarCuenta() {
        System.out.println("N° cuenta: " + getNumero());
        System.out.println("Saldo: " + getSaldo() + " €");
        System.out.println("Hola");    }
}
