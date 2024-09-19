public class Palindromo {

    public static boolean esPalindromo(String cadena) {
        String resultado = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(resultado);
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo("anilina")); // true
    }
}
