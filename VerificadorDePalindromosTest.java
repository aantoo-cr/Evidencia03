import org.junit.Test;
import static org.junit.Assert.*;

public class VerificadorDePalindromosTest {

    // Caso de prueba 1: Verifica si un número entero es un palíndromo.
    @Test
    public void testCasoDePrueba1() {
        String entrada = "200";
        boolean resultado = VerificadorDePalindromos.verificarPalindromo(entrada);
        assertFalse(resultado); // Se espera que "200" no sea un palíndromo.
    }

    // Caso de prueba 2: Verifica que una cadena vacía no sea considerada un palíndromo.
    @Test
    public void testCasoDePrueba2() {
        String entrada = "";
        boolean resultado = VerificadorDePalindromos.verificarPalindromo(entrada);
        assertFalse(resultado); // Se espera que una cadena vacía no sea un palíndromo.
    }

    // Caso de prueba 3: Verifica si la cadena "aaabcbcbaaa" es un palíndromo.
    @Test
    public void testCasoDePrueba3() {
        String entrada = "aaabcbcbaaa";
        boolean resultado = VerificadorDePalindromos.verificarPalindromo(entrada);
        assertTrue(resultado); // Se espera que "aaabcbcbaaa" sea un palíndromo.
    }

    // Caso de prueba 4: Verifica si la cadena "ahabcbcbaaa" es un palíndromo.
    @Test
    public void testCasoDePrueba4() {
        String entrada = "ahabcbcbaaa";
        boolean resultado = VerificadorDePalindromos.verificarPalindromo(entrada); // corregido
        assertFalse(resultado); // Se espera que "ahabcbcbaaa" no sea un palíndromo.
    }

    // Caso de prueba 5: Verifica si la cadena "La tele letal" es un palíndromo, ignorando mayúsculas y espacios.
    @Test
    public void testCasoDePrueba5() {
        String entrada = "La tele letal";
        boolean resultado = VerificadorDePalindromos.verificarPalindromo(entrada);
        assertTrue(resultado); // Se espera que "La tele letal" sea un palíndromo.
    }
}