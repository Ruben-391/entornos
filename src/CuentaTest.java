import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
    private Cuenta cuenta;

    @BeforeEach
    void inicializarCuenta() {
        cuenta = new Cuenta("ES21099865462528660871295", 100);
    }
    //LOS MÉTODOS NO SE PRUEBAN EN ESTE ORDEN, SINO EN ORDEN ALFABÉTICO
    @Test
    void testGetSaldo1() {
        float saldo = cuenta.getSaldo();
        assertEquals(100, saldo);
    }

    @Test
    void testGetNumero() {
    	String nCuenta = cuenta.getNumero();
    	assertEquals("ES21099865462528660871295", nCuenta);
    }
    
    @Test
    void testSetNumero() {
    	String nCuenta = cuenta.getNumero();
    	assertEquals("ES220099865462528660871295", nCuenta);
    }
    
    @Test
    void testGetSaldo() {
    	float saldo = cuenta.getSaldo();
    	assertEquals("ES340099865462528660874125", saldo);
    }
    
    @Test
    void testSetSaldo() {
        cuenta.setSaldo(100);
        assertEquals(100, cuenta.getSaldo());
    }

    @Test
    void testIngresarDinero() {
        cuenta.ingresarDinero(400);
        assertEquals(500, cuenta.getSaldo());
    }

    @Test
    void testExtraerDinero() {
        try {
            cuenta.extraerDinero(120); // Intentamos extraer más dinero del saldo disponible
            fail("ERROR. Se debería haber lanzado una excepción al resultar un saldo negativo");
        } catch (ArithmeticException ae) {
            // Prueba correcta: se lanzó la excepción esperada
            System.out.println("Prueba correcta: se lanzó la excepción esperada debido a saldo negativo");
        }
    }
}