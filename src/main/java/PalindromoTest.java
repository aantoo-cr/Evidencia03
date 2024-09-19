import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void testNoPalindromo() {
        assertFalse(Palindromo.esPalindromo("acas"));
    }

    @Test
    public void testDatoDistintoAString() {
        assertThrows(ClassCastException.class, () -> {
            Palindromo.esPalindromo((String) null); // Esto simula el ingreso de un tipo incorrecto
        });
    }

    @Test
    public void testStringConEspacios() {
        assertTrue(Palindromo.esPalindromo("aca a "));
    }

    @Test
    public void testStringConMayusculas() {
        assertTrue(Palindromo.esPalindromo("ACa"));
    }

    @Test
    public void testStringConComas() {
        assertTrue(Palindromo.esPalindromo("ac,a"));
    }

    @Test
    public void testStringConPuntos() {
        assertTrue(Palindromo.esPalindromo("ac.a"));
    }

    @Test
    public void testStringConGuion() {
        assertTrue(Palindromo.esPalindromo("a-ca"));
    }

    @Test
    public void testStringConGuionBajo() {
        assertTrue(Palindromo.esPalindromo("ac_a"));
    }
}

